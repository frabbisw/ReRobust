import json

with open("../clm/clm-apr/humaneval/plbart_result/plbart_input_c1.json") as f:
    style1 = json.load(f)
with open("../clm/clm-apr/humaneval/plbart_result/plbart_input_c2.json") as f:
    style2 = json.load(f)

input1 = []
for kc,vc in style1["data"].items():
    input1.append(vc["input"])
input1 = "\n".join(input1)

input2 = []
for kc,vc in style2["data"].items():
    input2.append(vc["input"])
input2 = "\n".join(input2)

with open("../data/refactoring/original/style1/test.buggy-fixed.buggy", "w") as f:
    f.write(input1)
with open("../data/refactoring/original/style1/test.buggy-fixed.fixed", "w") as f:
    f.write(input1)

with open("../data/refactoring/original/style2/test.buggy-fixed.buggy", "w") as f:
    f.write(input2)
with open("../data/refactoring/original/style2/test.buggy-fixed.fixed", "w") as f:
    f.write(input2)