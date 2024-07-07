import json

def get_info(validate_path):
    with open(validate_path) as f:
        data = json.load(f)

    print(data['config'])

    correct = 0
    total = 0
    for classname, odata in data['data'].items():
        occurences = [out['correctness'] for out in odata["output"]]
        # try:
        #     occurences = [odata["output"][0]['correctness']]
        # except:
        #     occurences = []
        correct += occurences.count('plausible') > 0
        total += 1

    return correct, total, round(correct/total, 2)


# paths = ["/home/frabbi/clm-apr/clm-apr/humaneval/plbart_result/plbart_base_validate_c1.json",
#          "/home/frabbi/clm-apr/clm-apr/humaneval/plbart_result/plbart_base_validate_c2.json",
#          "/home/frabbi/clm-apr/clm-apr/humaneval/plbart_result/plbart_large_validate_c1.json",
#          "/home/frabbi/clm-apr/clm-apr/humaneval/plbart_result/plbart_large_validate_c2.json",
#          "/home/frabbi/clm-apr/clm-apr/humaneval/codet5_result/codet5_small_validate_c1.json",
#          "/home/frabbi/clm-apr/clm-apr/humaneval/codet5_result/codet5_small_validate_c3.json",
#          "/home/frabbi/clm-apr/clm-apr/humaneval/codet5_result/codet5_base_validate_c1.json",
#          "/home/frabbi/clm-apr/clm-apr/humaneval/codet5_result/codet5_base_validate_c3.json",
#          "/home/frabbi/clm-apr/clm-apr/humaneval/codet5_result/codet5_large_validate_c1.json",
#          "/home/frabbi/clm-apr/clm-apr/humaneval/codet5_result/codet5_large_validate_c3.json",]

# paths = ["/home/frabbi/clm-apr/clm-apr/quixbugs/plbart_result/plbart_base_validate_c1.json",
#          "/home/frabbi/clm-apr/clm-apr/quixbugs/plbart_result/plbart_base_validate_c2.json",
#          "/home/frabbi/clm-apr/clm-apr/quixbugs/plbart_result/plbart_large_validate_c1.json",
#          "/home/frabbi/clm-apr/clm-apr/quixbugs/plbart_result/plbart_large_validate_c2.json",
#          "/home/frabbi/clm-apr/clm-apr/quixbugs/codet5_result/codet5_small_validate_c1.json",
#          "/home/frabbi/clm-apr/clm-apr/quixbugs/codet5_result/codet5_small_validate_c3.json",
#          "/home/frabbi/clm-apr/clm-apr/quixbugs/codet5_result/codet5_base_validate_c1.json",
#          "/home/frabbi/clm-apr/clm-apr/quixbugs/codet5_result/codet5_base_validate_c3.json",
#          "/home/frabbi/clm-apr/clm-apr/quixbugs/codet5_result/codet5_large_validate_c1.json",
#          "/home/frabbi/clm-apr/clm-apr/quixbugs/codet5_result/codet5_large_validate_c3.json",]

paths = ["/home/frabbi/clm-apr/clm-apr/defects4j/plbart_result/plbart_base_validate_c1.json",
         "/home/frabbi/clm-apr/clm-apr/defects4j/plbart_result/plbart_base_validate_c2.json",
         "/home/frabbi/clm-apr/clm-apr/defects4j/plbart_result/plbart_large_validate_c1.json",
         "/home/frabbi/clm-apr/clm-apr/defects4j/plbart_result/plbart_large_validate_c2.json",
         "/home/frabbi/clm-apr/clm-apr/defects4j/codet5_result/codet5_small_validate_c1.json",
         "/home/frabbi/clm-apr/clm-apr/defects4j/codet5_result/codet5_small_validate_c3.json",
         "/home/frabbi/clm-apr/clm-apr/defects4j/codet5_result/codet5_base_validate_c1.json",
         "/home/frabbi/clm-apr/clm-apr/defects4j/codet5_result/codet5_base_validate_c3.json",
         "/home/frabbi/clm-apr/clm-apr/defects4j/codet5_result/codet5_large_validate_c1.json",
         "/home/frabbi/clm-apr/clm-apr/defects4j/codet5_result/codet5_large_validate_c3.json",]

for path in paths:
    correct, total, correctness = get_info(path)
    print(f"Type: {path.split('/')[-1].split('.')[0]}, Correct: {correct}, Total: {total}, Correctness: {correctness}")
    print("**********\n")
