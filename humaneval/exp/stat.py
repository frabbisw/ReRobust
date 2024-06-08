# import json
#
# with open("test_passes.json") as f:
#     test_passes = json.load(f)
# with open("codebleu.json") as f:
#     codebleu = json.load(f)
#
#
# all_out = "Config, TestPasses, TestPassesRatio, CodeBLEU\n"
# for ttype, tdata in codebleu.items():
#     out_data = "Config, TestPasses, TestPassesRatio, CodeBLEU\n"
#     for model, model_data in tdata.items():
#         for model_size, model_size_data in model_data.items():
#             for style, style_data in model_size_data.items():
#                 if style == "":
#                     style = "c1.json"
#                 elif style == "_c1":
#                     style = "c1.json"
#                 elif style == "_c2":
#                     style = "c2.json"
#                 elif style == "_c3":
#                     style = "c3.json"
#                 total = test_passes[ttype][model][model_size][style]['transformed'][1]
#                 passes = test_passes[ttype][model][model_size][style]['transformed'][0]
#                 out_data += f"{ttype}|{model}|{model_size}|{style[:2]},{passes}/{total},{round(100*passes/(total),3)},{style_data[0]}\n"
#                 all_out += f"{ttype}|{model}|{model_size}|{style[:2]},{passes}/{total},{round(100*passes/(total),3)},{style_data[0]}\n"
#
#                 try:
#                     print(test_passes[ttype][model][model_size][style], style_data)
#                 except Exception as e:
#                     print("Error:", ttype, model, model_size, style, e)
#
#     with open(f"state_data/{ttype}.csv", "w") as f:
#         f.write(out_data)
# with open("state_data/statistics.csv", "w") as f:
#     f.write(all_out)

import json
import os
import sys
from scipy.stats import pearsonr
from scipy.stats import pearsonr, spearmanr


result_sequence = {"VariableRenaming":"variable_renaming", "MethodRenaming":f"method_renaming", "ParameterRenaming":f"parameter_renaming", "BooleanExchange":f"boolean_exchange", "LoopExchange":f"loop_exchange", "ReorderCondition":f"reorder_condition", "LogStatement":f"insert_log_statement", "TryCatch": f"insert_try_catch"}

with open("codebleu.json", "r") as f:
    codebleu_json = json.loads(f.read())

with open("test_passes.json", "r") as f:
    test_passes_json = json.loads(f.read())

results = "Dataset, ModelName, Transformation, isTransformed, pass@10, codebleu\n"
print("Transformation & Pearson Correlation & p-value & Pearson Correlation & p-value \\\\")
for t, name in result_sequence.items():
    # print(t, name)
    # codebleuscores_org = []
    # testpassesscores_org = []
    # codebleuscores_trans = []
    # testpassesscores_trans = []
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
            codebleuscores_trans.append(trans_codebleu)
            testpassesscores_trans.append(trans_pass)
            codebleuscores_org.append(org_codebleu)
            testpassesscores_org.append(org_pass)
            # results += f"HumanEval-Java, {model}_{msize}, {name}, original, {org_pass}, {org_codebleu}\n"
            # results += f"HumanEval-Java, {model}_{msize}, {name}, transformed, {trans_pass}, {trans_codebleu}\n"
            # results[model + msize] += [round(org_pass-org_pass,3), round(org_codebleu-org_codebleu,3), round(org_pass-trans_pass,3), round(org_codebleu-trans_codebleu,3)]
    testpassesscores_org = [x + .1 if x == 0 else x for x in testpassesscores_org]
    testpassesscores_trans = [x + .1 if x == 0 else x for x in testpassesscores_trans]
    stat_org, p_org = pearsonr(codebleuscores_org, testpassesscores_org)
    stat_trans, p_trans = pearsonr(codebleuscores_trans, testpassesscores_trans)
    # print(codebleuscores, testpassesscores)
    # print(stat_org, p_org)
    # print(stat_trans, p_trans)
    name_with_backslash = name.replace("_", "\_")
    print(f"{name_with_backslash} & {round(stat_org,3)} & {round(p_org,3)} & {round(stat_trans,3)} & {round(p_trans,3)} \\\\")
