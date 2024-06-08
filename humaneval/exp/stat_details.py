import json
import os
import sys
from scipy.stats import pearsonr
from scipy.stats import pearsonr, spearmanr


result_sequence = {"VariableRenaming":"variable_renaming", "MethodRenaming":f"method_renaming", "ParameterRenaming":f"parameter_renaming", "BooleanExchange":f"boolean_exchange", "LoopExchange":f"loop_exchange", "ReorderCondition":f"reorder_condition", "LogStatement":f"insert_log_statement", "TryCatch": f"insert_try_catch"}

with open("codebleu_details.json", "r") as f:
    codebleu_json = json.loads(f.read())

with open("testpasses_details.json", "r") as f:
    test_passes_json = json.loads(f.read())

def get_pearson_scores(passes_classes_dict, bleu_classes_dict):
    list_passes = []
    list_bleu = []
    for classname in bleu_classes_dict.keys():
        for index in bleu_classes_dict[classname].keys():
            try:
                list_passes.append(passes_classes_dict[classname][index])
                list_bleu.append(bleu_classes_dict[classname][index])
                # print("ok")
            except Exception as e:
                # print(e)
                continue
    assert len(list_passes) == len(list_bleu)
    stat, p = pearsonr(list_bleu, list_passes)

    return stat, p


print("Transformation & Pearson Correlation & p-value & Pearson Correlation & p-value \\\\")
for t, name in result_sequence.items():
    print(t, name)
    for model in codebleu_json[t].keys():
        if "finetune" in model:
            continue
        for msize in codebleu_json[t][model].keys():
            org_passes = test_passes_json[t][model][msize]["c1.json"]["original"]
            trans_passes = test_passes_json[t][model][msize]["c1.json"]["transformed"]
            org_bleu = codebleu_json[t][model][msize]["_c1"]["original"]
            trans_bleu = codebleu_json[t][model][msize]["_c1"]["transformed"]

            stat_org, p_org = get_pearson_scores(org_passes, org_bleu)
            stat_trans, p_trans = get_pearson_scores(trans_passes, trans_bleu)
            print(f"\t\t{model.replace('_finetune','')}\_{msize} & {round(stat_org,3)} & {round(p_org,3)} & {round(stat_trans,3)} & {round(p_trans,3)} \\\\")

