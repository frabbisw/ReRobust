import json
import os
from os.path import join, isfile
from os import listdir
import re
from bleu import _bleu
from CodeBLEU import syntax_match, bleu, dataflow_match
from codebleu import calc_codebleu

codebleu_path = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/alltogether_codebleu/"
plbart_org_result_path = join(codebleu_path, "Original", "plbart")
codet5_org_result_path = join(codebleu_path, "Original", "codet5")
plbart_finetune_org_result_path = join(codebleu_path, "Original", "plbart_finetune")
codet5_finetune_org_result_path = join(codebleu_path, "Original", "codet5_finetune")
transformation_types = ["BooleanExchange", "LogStatement", "LoopExchange", "MethodRenaming", "ParameterRenaming", "ReorderCondition", "TryCatch", "VariableRenaming"]

#modelname -> size -> style
plbartfiles = [join(plbart_org_result_path, f) for f in listdir(plbart_org_result_path) if isfile(join(plbart_org_result_path, f))]
codet5files = [join(codet5_org_result_path, f) for f in listdir(codet5_org_result_path) if isfile(join(codet5_org_result_path, f))]
plbart_finetune_files = [join(plbart_finetune_org_result_path, f) for f in listdir(plbart_finetune_org_result_path) if isfile(join(plbart_finetune_org_result_path, f))]
codet5_finetune_files = [join(codet5_finetune_org_result_path, f) for f in listdir(codet5_finetune_org_result_path) if isfile(join(codet5_finetune_org_result_path, f))]

result_path = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/alltogether/"
tmp_dir = "/home/frabbi/Downloads/tmp/dir/"
ttypes = ["BooleanExchange", "LogStatement", "LoopExchange", "MethodRenaming", "ParameterRenaming", "ReorderCondition", "TryCatch", "VariableRenaming"]

models = {"plbart":
              {"size":["base", "large"],
               "style":["_c1","_c2"],
               "name_in_file":"plbart"},
            "plbart_finetune":
              {"size":["base", "large"],
               "style":[""],
               "name_in_file":"plbart"},
            "codet5":
              {"size":["small", "base", "large"],
               "style":["_c1","_c3"],
               "name_in_file":"codet5"},
            "codet5_finetune":
                {"size":["small", "base", "large"],
                 "style":[""],
               "name_in_file":"codet5"},}

org_results_files_dict = {
    "plbart": plbartfiles,
    "codet5": codet5files,
    "plbart_finetune": plbart_finetune_files,
    "codet5_finetune": codet5_finetune_files,
}

def codet5_output_to_patch(output, config):
    if config in ['CODET5_BASE_CODEFORM_MASKFORM_NOCOMMENT', 'CODET5_BASE_CODEFORM_COMMENTFORM_NOCOMMENT']:
        return output.strip()
    elif config == 'CODET5_REFINE_CODEFORM_NOCOMMENT':
        stack = ['{']
        start_index = output.index('{')
        patch = output[: start_index + 1]
        for c in output[start_index + 1: ]:
            patch += c
            if c == '}':
                top = stack.pop()
                if top != '{':
                    return ''
                if len(stack) == 0:
                    return patch.strip()
            elif c == '{':
                stack.append(c)
        return ''
def plbart_output_to_patch(output, config):
    output = re.sub('/\\*.*\\*/', '', output)
    if config in ['PLBART_SEQFORM_MASKFORM_NOCOMMENT', 'PLBART_SEQFORM_COMMENTFORM_NOCOMMENT']:
        stack = ['{']
        if '{' not in output:
            return ''
        start_index = output.index('{')
        patch = output[: start_index + 1]
        for c in output[start_index + 1: ]:
            patch += c
            if c == '}':
                top = stack.pop()
                if top != '{':
                    return ''
                if len(stack) == 0:
                    return patch.strip()
            elif c == '{':
                stack.append(c)
        return ''

def insert_fix(buggy_code, start_line, end_line, patch):
    """
    end_row is included in the buggy lines / buggy function
    """
    data = buggy_code.split("\n")
    transformed_buggy_code = []
    for i in range(start_line - 1):
        transformed_buggy_code.append(data[i] + '\n')
    transformed_buggy_code.append(patch.strip())
    for i in range(end_line, len(data)):
        transformed_buggy_code.append(data[i])

    return "".join(transformed_buggy_code)

def retrieve_code_pairs(classname, odata, config, ttype):
    reference = {}
    hypothesis = {}
    try:
        start_line, end_line = odata["loc"].split('-')
        end_line = str(int(end_line) - 1) if end_line != start_line else end_line
    except Exception as e:
        return None, None
    try:
        function_start_line, function_end_line = odata["function range"].split('-')
        function_start_line, function_end_line = function_start_line.split(',')[0], function_end_line.split(',')[0]
    except Exception as e:
        if config != 'finetune':
            return None, None
    try:
        with open(join(codebleu_path, ttype, "buggy", f"{classname}.java"), 'r') as f:
            buggy_code = f.read()
        with open(join(codebleu_path, ttype, "fixed", f"{classname}.java"), 'r') as f:
            fixed_code = f.read()
    except Exception as e:
        print(e)
        return None, None
    reference[classname] = fixed_code
    count = 0
    for patch in odata["output"]:
        if type(patch) == dict:
            patch = patch["patch"]
        if 'CODET5' in config:
            patch = codet5_output_to_patch(patch, config)
            if config in ['CODET5_BASE_CODEFORM_MASKFORM_NOCOMMENT', 'CODET5_BASE_CODEFORM_COMMENTFORM_NOCOMMENT']:
                transformed_buggy_code = insert_fix(buggy_code, int(start_line), int(end_line), patch)
                if count not in hypothesis:
                    hypothesis[count] = {}
                hypothesis[count][classname] = transformed_buggy_code
        elif 'PLBART' in config:
            patch = plbart_output_to_patch(patch, config)
            transformed_buggy_code = insert_fix(buggy_code, int(function_start_line), int(function_end_line), patch)
            if count not in hypothesis:
                hypothesis[count] = {}
            hypothesis[count][classname] = transformed_buggy_code
        elif 'finetune' in config:
            transformed_buggy_code = insert_fix(buggy_code, int(start_line), int(end_line), patch)
            if count not in hypothesis:
                hypothesis[count] = {}
            hypothesis[count][classname] = transformed_buggy_code
        count += 1
    return reference, hypothesis

def get_org_pairs(org_result_files):
    org_pairs_dict = {}
    for file in org_result_files:
        if "validate" in file.split("/")[-1]:
            try:
                modelname, model_size, result_type, style = file.split("/")[-1].split("_")
            except Exception as e:
                modelname, model_size, result_type = file.split("/")[-1].split("_")
                style = "c1.json"
            style = "_" + style.split(".")[0]
            if modelname not in org_pairs_dict:
                org_pairs_dict[modelname] = {}
            if model_size not in org_pairs_dict[modelname]:
                org_pairs_dict[modelname][model_size] = {}
            if style not in org_pairs_dict[modelname][model_size]:
                org_pairs_dict[modelname][model_size][style] = {}
            data = json.load(open(file, 'r'))
            config = data["config"]
            data = data["data"]
            for classname, odata in data.items():
                reference, hypothesis = retrieve_code_pairs(classname, odata, config, "Original")
                org_pairs_dict[modelname][model_size][style][classname] = {"reference": reference, "hypothesis": hypothesis}
    return org_pairs_dict

def cal_codebleu_from_ref_and_hyp(ref, hyps):
    all_classes_result = {}
    for classname in ref.keys():
        all_classes_result[classname] = {}
        for i in hyps.keys():
            all_classes_result[classname][i] = calc_codebleu([ref[classname]], [hyps[i][classname]], "java")["codebleu"]
    return all_classes_result

org_result_files_codet5 = org_results_files_dict["codet5"]
org_pairs_dict_codet5 = get_org_pairs(org_result_files_codet5)
org_result_files_plbart = org_results_files_dict["plbart"]
org_pairs_dict_plbart = get_org_pairs(org_result_files_plbart)
org_result_files_codet5_finetune = org_results_files_dict["codet5_finetune"]
org_pairs_dict_codet5_finetune = get_org_pairs(org_result_files_codet5_finetune)
org_result_files_plbart_finetune = org_results_files_dict["plbart_finetune"]
org_pairs_dict_plbart_finetune = get_org_pairs(org_result_files_plbart_finetune)
org_pairs_dict = {}
org_pairs_dict["codet5"] = org_pairs_dict_codet5["codet5"]
org_pairs_dict["plbart"] = org_pairs_dict_plbart["plbart"]
org_pairs_dict["codet5_finetune"] = org_pairs_dict_codet5_finetune["codet5"]
org_pairs_dict["plbart_finetune"] = org_pairs_dict_plbart_finetune["plbart"]

def get_result(ttype, model, model_size, style, json_path):
    if style == "":
        style = "_c1"
    # org_result_files = org_results_files_dict[model]
    # org_pairs_dict = get_org_pairs(org_result_files)
    with open(json_path) as f:
        data = json.load(f)
        config = data["config"]
        reference = {}
        hypothesis = {}


        for classname, odata in data["data"].items():
            try:
                start_line, end_line = odata["loc"].split('-')
                end_line = str(int(end_line) - 1) if end_line != start_line else end_line
            except Exception as e:
                continue
            try:
                function_start_line, function_end_line = odata["function range"].split('-')
                function_start_line, function_end_line = function_start_line.split(',')[0], function_end_line.split(',')[0]
            except Exception as e:
                if config != 'finetune':
                    continue

            try:
                with open(join(codebleu_path, ttype, "buggy", f"{classname}.java"), 'r') as f:
                    buggy_code = f.read()
                with open(join(codebleu_path, ttype, "fixed", f"{classname}.java"), 'r') as f:
                    fixed_code = f.read()
            except Exception as e:
                print(e)
                continue
            reference[classname] = fixed_code

            count = 0
            for patch in odata["output"]:
                if 'CODET5' in config:
                    patch = codet5_output_to_patch(patch, config)
                    if config in ['CODET5_BASE_CODEFORM_MASKFORM_NOCOMMENT', 'CODET5_BASE_CODEFORM_COMMENTFORM_NOCOMMENT']:
                        transformed_buggy_code = insert_fix(buggy_code, int(start_line), int(end_line), patch)
                        if count not in hypothesis:
                            hypothesis[count] = {}
                        hypothesis[count][classname] = transformed_buggy_code
                elif 'PLBART' in config:
                    patch = plbart_output_to_patch(patch, config)
                    transformed_buggy_code = insert_fix(buggy_code, int(function_start_line), int(function_end_line), patch)
                    if count not in hypothesis:
                        hypothesis[count] = {}
                    hypothesis[count][classname] = transformed_buggy_code
                elif 'finetune' in config:
                    transformed_buggy_code = insert_fix(buggy_code, int(start_line), int(end_line), patch)
                    if count not in hypothesis:
                        hypothesis[count] = {}
                    hypothesis[count][classname] = transformed_buggy_code
                count += 1
    transformed_ref = {}
    transformed_hyps = {}
    org_classname_list = []
    for classname in reference.keys():
        if classname.split("_")[-1].isdigit():
            org_classname_list.append(classname[:classname.rfind("_")])
        else:
            org_classname_list.append(classname)
        transformed_ref[classname] = reference[classname]
        for index in hypothesis.keys():
            if index not in transformed_hyps:
                transformed_hyps[index] = {}
            transformed_hyps[index][classname] = hypothesis[index][classname]

    original_ref = {}
    original_hyps = {}
    org_ref_hyp_pairs = org_pairs_dict[model][model_size][style]
    for classname, info in org_ref_hyp_pairs.items():
        if classname not in org_classname_list:
            # print(f"Error: {classname} not in org_classname_list")
            continue
        try:
            original_ref[classname] = info["reference"][classname]
        except Exception as e:
            print(e)
            continue
        for index in info["hypothesis"].keys():
            if index not in original_hyps:
                original_hyps[index] = {}
            original_hyps[index][classname] = info["hypothesis"][index][classname]

    return {"original":
                cal_codebleu_from_ref_and_hyp(original_ref, original_hyps),
            "transformed":
                cal_codebleu_from_ref_and_hyp(transformed_ref, transformed_hyps)}

codebleu_dict = {}

for ttype in ttypes:
    if ttype not in codebleu_dict:
        codebleu_dict[ttype] = {}
    for model, model_info in models.items():
        if model not in codebleu_dict[ttype]:
            codebleu_dict[ttype][model] = {}
        for model_size in model_info["size"]:
            if model_size not in codebleu_dict[ttype][model]:
                codebleu_dict[ttype][model][model_size] = {}
            for style in model_info["style"]:
                json_path = join(result_path, ttype, model, f"{model_info['name_in_file']}_{model_size}_output{style}.json")
                res = get_result(ttype, model, model_size, style, json_path)
                codebleu_dict[ttype][model][model_size][style if style != "" else "_c1"] = res
                print("START HERE:", ttype, model, model_size, style if style != "" else "_c1")


with open("codebleu_details.json", "w") as f:
    json.dump(codebleu_dict, f, indent=4)
