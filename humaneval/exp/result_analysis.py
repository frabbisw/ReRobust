import json
import os
from os.path import join, isfile
from os import listdir
import subprocess
import difflib

data_path = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/master_data/"
plbart_org_result_path = join(data_path, "Original", "plbart")
codet5_org_result_path = join(data_path, "Original", "codet5")
plbart_finetune_org_result_path = join(data_path, "Original", "plbart_finetune")
codet5_finetune_org_result_path = join(data_path, "Original", "codet5_finetune")

transformation_types = ["BooleanExchange", "LogStatement", "LoopExchange", "MethodRenaming", "ParameterRenaming", "ReorderCondition", "TryCatch", "VariableRenaming"]

#modelname -> size -> style
plbartfiles = [join(plbart_org_result_path, f) for f in listdir(plbart_org_result_path) if isfile(join(plbart_org_result_path, f))]
codet5files = [join(codet5_org_result_path, f) for f in listdir(codet5_org_result_path) if isfile(join(codet5_org_result_path, f))]
plbart_finetune_files = [join(plbart_finetune_org_result_path, f) for f in listdir(plbart_finetune_org_result_path) if isfile(join(plbart_finetune_org_result_path, f))]
codet5_finetune_files = [join(codet5_finetune_org_result_path, f) for f in listdir(codet5_finetune_org_result_path) if isfile(join(codet5_finetune_org_result_path, f))]

# def get_org_class_dict(path):
#     patches_dict = {}
#     with open(path, "r") as f:
#         org_result = json.load(f)
#         for classname in org_result["data"].keys():
#             for node in org_result["data"][classname]["output"]:
#                 if node["correctness"] == "plausible":
#                     patches_dict[classname] = node["patch"]
#                     break
#     return patches_dict
#
def get_org_class_name(classname):
    if ',' in classname:
        classname = classname[:classname.rfind(",")]
    if '_' in classname:
        if classname.split('_')[-1].isdigit():
            classname = classname[:classname.rfind('_')]
            classname = get_org_class_name(classname)

    return classname
#
# print(get_org_class_name("VALIDDATE_8880"))
#
# exit()

#json dict: modelname -> size -> style -> classname -> corrects
def get_org_result(org_result_files):
    org_result = {}
    for file in org_result_files:
        if "validate" in file.split("/")[-1]:
            try:
                modelname, model_size, result_type, style = file.split("/")[-1].split("_")
            except:
                modelname, model_size, result_type = file.split("/")[-1].split("_")
                style = "c1.json"
            if modelname not in org_result:
                org_result[modelname] = {}
            if model_size not in org_result[modelname]:
                org_result[modelname][model_size] = {}
            if style not in org_result[modelname][model_size]:
                org_result[modelname][model_size][style] = {}
            data = json.load(open(file, 'r'))
            config = data["config"]
            data = data["data"]
            for classname, info in data.items():
                corrects=0
                correct_patch="$%$@#$%$$"
                for result in info["output"]:
                    if result["correctness"] == "plausible":
                        corrects += 1
                        correct_patch = result["patch"]
                # corrects = sum([result["correctness"] == "plausible" for result in info["output"]])
                org_result[modelname][model_size][style][classname] = {"corrects": corrects, "correct_patch": correct_patch}
    return org_result

def process_json(tt, file, json_path, org_result):
    try:
        model_name, model_size, result_type, style = file.split("_")
    except:
        model_name, model_size, result_type = file.split("_")
        style = "c1.json"
    # json_path = join(data_path, tt, model_name, file)
    # print(json_path)

    with open(json_path, 'r') as f:
        data = json.load(f)
        config = data["config"]
        data = data["data"]
        # correct_cnt_for_transformed_class = 0
        # correct_cnt_for_original_class = 0
        correct_org_incorrent_transformed = 0
        correct_org_correct_transformed = 0
        incorrect_org_correct_transformed = 0
        incorrect_org_incorrect_transformed = 0

        for classname, info in data.items():
            classname_without_extra = get_org_class_name(classname)
            # classname_without_extra = classname
            # if ',' in classname_without_extra:
            #     classname_without_extra = classname_without_extra[:classname_without_extra.rfind(",")]
            # if "_" in classname_without_extra and classname_without_extra.split("_")[-1].isdigit():
            #     classname_without_extra = classname_without_extra[:classname_without_extra.rfind("_")]


            try:
                corrects = sum([rinfo["correctness"] == "plausible" or rinfo["patch"] == org_result[model_name][model_size][style][classname_without_extra]["correct_patch"] for rinfo in info["output"]])
                # corrects = sum([rinfo["correctness"] == "plausible" for rinfo in info["output"]])
                correct_cnt_for_transformed_class = corrects > 0
                correct_cnt_for_original_class = org_result[model_name][model_size][style][classname_without_extra]["corrects"] > 0
                correct_org_incorrent_transformed += correct_cnt_for_original_class and not correct_cnt_for_transformed_class
                correct_org_correct_transformed += correct_cnt_for_original_class and correct_cnt_for_transformed_class
                incorrect_org_correct_transformed += not correct_cnt_for_original_class and correct_cnt_for_transformed_class
                incorrect_org_incorrect_transformed += not correct_cnt_for_original_class and not correct_cnt_for_transformed_class
            except Exception as e:
                print(f"Error: {e} {tt} {file} {classname} {classname_without_extra}")

        return config, [correct_org_incorrent_transformed, correct_org_correct_transformed, incorrect_org_correct_transformed, incorrect_org_incorrect_transformed]

def get_test_result(org_results_files_dict, model_names):
    model_result = {}
    for tt in transformation_types:
        print(tt)
        if tt not in model_result:
            model_result[tt] = {}
        for model_name in model_names:
            org_result_files = org_results_files_dict[model_name]
            org_result = get_org_result(org_result_files)
            if model_name not in model_result[tt]:
                model_result[tt][model_name] = {}
            onlyfiles = [f for f in listdir(join(data_path, tt, model_name)) if isfile(join(join(data_path, tt, model_name), f))]
            for file in onlyfiles:
                if "validate" in file:
                    try:
                        _, model_size, result_type, style = file.split("_")
                    except:
                        _, model_size, result_type = file.split("_")
                        style = "c1.json"

                    if model_size not in model_result[tt][model_name]:
                        model_result[tt][model_name][model_size] = {}
                    if style not in model_result[tt][model_name][model_size]:
                        model_result[tt][model_name][model_size][style] = {}

                    json_path = join(data_path, tt, model_name, file)
                    config, [correct_org_incorrent_transformed, correct_org_correct_transformed, incorrect_org_correct_transformed, incorrect_org_incorrect_transformed] = process_json(tt, file, json_path, org_result)

                    print(f"{tt}, {model_name}, {style.split('.')[0]}")
                    print(f"Correctness for {tt+':'+(25-len(tt))*' '}{(correct_org_correct_transformed+incorrect_org_correct_transformed)}/{(correct_org_incorrent_transformed+correct_org_correct_transformed+incorrect_org_correct_transformed+incorrect_org_incorrect_transformed)}")
                    print(f"Correctness Original: \t{' '*20}{(correct_org_correct_transformed+correct_org_incorrent_transformed)}/{(correct_org_incorrent_transformed+correct_org_correct_transformed+incorrect_org_correct_transformed+incorrect_org_incorrect_transformed)}")
                    print("="*50)
                    model_result[tt][model_name][model_size][style]["transformed"] = [correct_org_correct_transformed+incorrect_org_correct_transformed,correct_org_incorrent_transformed+correct_org_correct_transformed+incorrect_org_correct_transformed+incorrect_org_incorrect_transformed]
                    model_result[tt][model_name][model_size][style]["original"] = [correct_org_correct_transformed+correct_org_incorrent_transformed,correct_org_incorrent_transformed+correct_org_correct_transformed+incorrect_org_correct_transformed+incorrect_org_incorrect_transformed]
    return model_result

org_results_files_dict = {
    "plbart": plbartfiles,
    "codet5": codet5files,
    "plbart_finetune": plbart_finetune_files,
    "codet5_finetune": codet5_finetune_files,
}

result = get_test_result(org_results_files_dict, ["plbart", "codet5", "plbart_finetune", "codet5_finetune"])

with open("test_passes.json", 'w') as f:
    json.dump(result, f, indent=4)

# plbart_result = get_test_result(plbartfiles, ["plbart", code])
# codet5_result = get_test_result(codet5files, ["codet5"])
# plbart_finetune_result = get_test_result(plbart_finetune_files, ["plbart_finetune"])
# codet5_finetune_result = get_test_result(codet5_finetune_files, ["codet5_finetune"])

# result = {
#     "plbart": plbart_result,
#     "codet5": codet5_result,
#     "plbart_finetune": plbart_finetune_result,
#     "codet5_finetune": codet5_finetune_result,
# }

# get_org_result
# org_result_files = plbart_finetune_files
# org_result = get_org_result(org_result_files)
# print(org_result)

