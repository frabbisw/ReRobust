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
model_names = ["plbart_finetune"]

#modelname -> size -> style
plbartfiles = [join(plbart_org_result_path, f) for f in listdir(plbart_org_result_path) if isfile(join(plbart_org_result_path, f))]
codet5files = [join(codet5_org_result_path, f) for f in listdir(codet5_org_result_path) if isfile(join(codet5_org_result_path, f))]
plbart_finetune_files = [join(plbart_finetune_org_result_path, f) for f in listdir(plbart_finetune_org_result_path) if isfile(join(plbart_finetune_org_result_path, f))]
codet5_finetune_files = [join(codet5_finetune_org_result_path, f) for f in listdir(codet5_finetune_org_result_path) if isfile(join(codet5_finetune_org_result_path, f))]

org_result_files = plbart_finetune_files

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
                corrects = sum([result["correctness"] == "plausible" for result in info["output"]])
                org_result[modelname][model_size][style][classname] = corrects
    return org_result
org_result = get_org_result(org_result_files)
print(org_result)
# exit()
def process_json(tt, file, json_path):
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
            classname_with_extra = classname
            if ',' in classname:
                classname = classname[:classname.rfind(",")]
            elif "_" in classname and classname.split("_")[-1].isdigit():
                classname = classname[:classname.rfind("_")]

            try:
                corrects = sum([result["correctness"] == "plausible" for result in info["output"]])
                correct_cnt_for_transformed_class = corrects > 0
                correct_cnt_for_original_class = org_result[model_name][model_size][style][classname] > 0
                correct_org_incorrent_transformed += correct_cnt_for_original_class and not correct_cnt_for_transformed_class
                correct_org_correct_transformed += correct_cnt_for_original_class and correct_cnt_for_transformed_class
                incorrect_org_correct_transformed += not correct_cnt_for_original_class and correct_cnt_for_transformed_class
                incorrect_org_incorrect_transformed += not correct_cnt_for_original_class and not correct_cnt_for_transformed_class
            except Exception as e:
                print(f"Error: {e} {tt} {file} {classname} {classname_with_extra}")
        return config, [correct_org_incorrent_transformed, correct_org_correct_transformed, incorrect_org_correct_transformed, incorrect_org_incorrect_transformed]

for tt in transformation_types:
    for model_name in model_names:
        onlyfiles = [f for f in listdir(join(data_path, tt, model_name)) if isfile(join(join(data_path, tt, model_name), f))]
        for file in onlyfiles:
            # print(join(data_path, tt, model_name, file))
            # continue
            if "validate" in file:
                # print(file)
                try:
                    _, model_size, result_type, style = file.split("_")
                except:
                    _, model_size, result_type = file.split("_")
                    style = "c1.json"
                json_path = join(data_path, tt, model_name, file)

                config, [correct_org_incorrent_transformed, correct_org_correct_transformed, incorrect_org_correct_transformed, incorrect_org_incorrect_transformed] = process_json(tt, file, json_path)

                # print(f"{tt}, {model_name}, {model_size}, {style.split('.')[0]}")
                print(f"{tt}, {model_name}, {style.split('.')[0]}")
                # print(f"{correct_org_incorrent_transformed}, {correct_org_correct_transformed}, {incorrect_org_correct_transformed}, {incorrect_org_incorrect_transformed}")
                print(f"Correctness for {tt+':'+(25-len(tt))*' '}{(correct_org_correct_transformed+incorrect_org_correct_transformed)}/{(correct_org_incorrent_transformed+correct_org_correct_transformed+incorrect_org_correct_transformed+incorrect_org_incorrect_transformed)}")
                print(f"Correctness Original: \t{' '*20}{(correct_org_correct_transformed+correct_org_incorrent_transformed)}/{(correct_org_incorrent_transformed+correct_org_correct_transformed+incorrect_org_correct_transformed+incorrect_org_incorrect_transformed)}")
                print("="*50)

