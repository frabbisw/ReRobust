import json
import os
import sys


result_sequence = {"VariableRenaming":"variable_renaming", "MethodRenaming":f"method_renaming", "ParameterRenaming":f"parameter_renaming", "BooleanExchange":f"boolean_exchange", "LoopExchange":f"loop_exchange", "ReorderCondition":f"reorder_condition", "LogStatement":f"insert_log_statement", "TryCatch": f"insert_try_catch"}

with open("codebleu.json", "r") as f:
    codebleu_json = json.loads(f.read())

with open("test_passes.json", "r") as f:
    test_passes_json = json.loads(f.read())

results = "Dataset, ModelName, Transformation, isTransformed, pass@10, codebleu\n"
for t, name in result_sequence.items():
    for model in codebleu_json[t].keys():
        if "finetune" in model:
            continue
        for msize in codebleu_json[t][model].keys():
            org_pass_p, org_pass_f = test_passes_json[t][model][msize]["c1.json"]["original"]
            trans_pass_p, trans_pass_f = test_passes_json[t][model][msize]["c1.json"]["transformed"]
            org_pass = round(100 * org_pass_p / (org_pass_f+org_pass_p), 3)
            trans_pass = round(100 * trans_pass_p /(trans_pass_f+trans_pass_p), 3)
            org_codebleu = codebleu_json[t][model][msize]["_c1"]["original"][0]
            trans_codebleu = codebleu_json[t][model][msize]["_c1"]["transformed"][0]
            results += f"HumanEval-Java, {model}_{msize}, {name}, original, {org_pass}, {org_codebleu}\n"
            results += f"HumanEval-Java, {model}_{msize}, {name}, transformed, {trans_pass}, {trans_codebleu}\n"
            # results[model + msize] += [round(org_pass-org_pass,3), round(org_codebleu-org_codebleu,3), round(org_pass-trans_pass,3), round(org_codebleu-trans_codebleu,3)]

# print(results)
with open("boxplot_pretrained.csv", "w") as f:
    f.write(results)