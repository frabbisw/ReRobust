import json
import os
from os.path import join, isfile
from os import listdir
import subprocess
import difflib

data_path = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/alltogether/"
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
                corrects = [result["correctness"] == "plausible" for result in info["output"]]
                corrects = {i: int(corrects[i]) for i in range(len(corrects))}
                org_result[modelname][model_size][style][classname] = corrects
    return org_result

def process_json(tt, file, json_path):
    print(tt, json_path)
    with open(json_path, 'r') as f:
        data = json.load(f)
        config = data["config"]
        data = data["data"]
        # print(len(data.keys()))
        class_corrects = {}
        for classname, info in data.items():
            try:
                corrects = [result["correctness"] == "plausible" for result in info["output"]]
                corrects = {i: int(corrects[i]) for i in range(len(corrects))}
                class_corrects[classname] = corrects
            except Exception as e:
                print(f"Error: {e} {tt} {file} {classname}")
        # print(len(class_corrects.keys()))
        # print("#"*50)
        return config, class_corrects


def get_test_result(org_results_files_dict, model_names):
    model_result = {}
    for tt in transformation_types:
        if tt not in model_result:
            model_result[tt] = {}
        for model_name in model_names:
            org_result_files = org_results_files_dict[model_name]
            org_result = get_org_result(org_result_files)
            # print(org_result.keys(), model_name)
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
                    config, class_corects = process_json(tt, file, json_path)

                    # print(f"{tt}, {model_name}, {style.split('.')[0]}")
                    # print("="*50)
                    model_result[tt][model_name][model_size][style]["transformed"] = class_corects
                    # print(len(class_corects.keys()))
                    # print("#"*50)
                    # print(tt, model_name, model_size, style)
                    # print(len(model_result[tt][model_name][model_size][style]["transformed"].keys()))
                    # print("#"*50)
                    try:
                        model_result[tt][model_name][model_size][style]["original"] = org_result[model_name][model_size][style]
                        # print(len(org_result[model_name][model_size][style].keys()))
                    except Exception as e:
                        if "finetune" in model_name:
                            model_result[tt][model_name][model_size][style]["original"] = org_result[model_name.split("_")[0]][model_size][style]
                            # print(len(org_result[model_name.split("_")[0]][model_size][style].keys()))
                        # print("Error Checked:", tt, model_name, model_size, style, e)
                    print("&"*50)
    return model_result

org_results_files_dict = {
    "plbart": plbartfiles,
    "codet5": codet5files,
    "plbart_finetune": plbart_finetune_files,
    "codet5_finetune": codet5_finetune_files,
}

result = get_test_result(org_results_files_dict, ["plbart", "codet5", "plbart_finetune", "codet5_finetune"])

with open("testpasses_details.json", 'w') as f:
    json.dump(result, f, indent=4)
print("haha")
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

