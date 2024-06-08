import json
import os
import sys

template = "models_table_template.txt"

result_sequence = [{"VariableRenaming":"variable_renaming", "MethodRenaming":f"method_renaming", "ParameterRenaming":f"parameter_renaming"},
                   {"BooleanExchange":f"boolean_exchange", "LoopExchange":f"loop_exchange", "ReorderCondition":f"reorder_condition"},
                   {"":"", "LogStatement":f"insert_log_statement", "TryCatch": f"insert_try_catch"}]


with open(template, "r") as f:
    template = f.read()

with open("codebleu.json", "r") as f:
    codebleu_json = json.loads(f.read())

with open("test_passes.json", "r") as f:
    test_passes_json = json.loads(f.read())

for transformations in result_sequence:
    results = {}
    for t, tname in transformations.items():
        print(tname)
        if t == "":
            continue
        for model in codebleu_json[t].keys():
            if "finetune" not in model:
                continue
            for msize in codebleu_json[t][model].keys():
                if model+msize not in results:
                    results[model+msize] = [f"{model}_{msize}"]
                org_pass_p, org_pass_f = test_passes_json[t][model][msize]["c1.json"]["original"]
                trans_pass_p, trans_pass_f = test_passes_json[t][model][msize]["c1.json"]["transformed"]
                org_pass = round(100 * org_pass_p / (org_pass_f+org_pass_p), 3)
                trans_pass = round(100 * trans_pass_p /(trans_pass_f+trans_pass_p), 3)
                org_codebleu = codebleu_json[t][model][msize]["_c1"]["original"][0]
                trans_codebleu = codebleu_json[t][model][msize]["_c1"]["transformed"][0]
                # results[model+msize] += [org_pass, org_codebleu, trans_pass, trans_codebleu]
                # results[model + msize] += [round(org_pass-org_pass,3), round(org_codebleu-org_codebleu,3), round(org_pass-trans_pass,3), round(org_codebleu-trans_codebleu,3)]
                model_with_backslash = model.replace("_finetune","").replace("_", "\_")
                print(f"\t\t\t{model_with_backslash}\_{msize} & {org_pass} & {org_codebleu} & {trans_pass} & {trans_codebleu} \\\\")
        print("\n\n")
    # print(transformations)
    # for k, v in results.items():
    #     if len(v) < 13:
    #         v = v[0:1] + [""] * 4 + v[1:]
    #     v[0] = v[0].replace("_", "\_")
    #     print("\t\t" + " & ".join(map(str, v)) + " \\\\")