import json

with open("../clm/clm-apr/humaneval/plbart_result/plbart_input_c1.json") as f:
    style1 = json.load(f)
with open("../clm/clm-apr/humaneval/plbart_result/plbart_input_c2.json") as f:
    style2 = json.load(f)

with open("../result/refactoring/modit/original/style1/output.hyp") as f:
    output1 = f.read().split("\n")
with open("../result/refactoring/modit/original/style2/output.hyp") as f:
    output2 = f.read().split("\n")

code_path = "../clm/humaneval-java/src/main/java/humaneval/buggy/"
test_path = "../clm/humaneval-java/src/test/java/humaneval/"
save_path = "../data/java_codes/original/"
def eliminate_unnecessary_code(full_class, test_class, classname):
    full_class = full_class.replace("package humaneval.buggy;\n\n", "")
    full_class = full_class.replace("package humaneval.buggy;\n", "")
    full_class = full_class.replace("package humaneval.buggy;", "")
    test_class = test_class.replace("package humaneval;\n\n", "")
    test_class = test_class.replace("package humaneval;\n", "")
    test_class = test_class.replace("package humaneval;", "")
    test_class = test_class.replace("humaneval.buggy.", "")
    test_class = test_class.replace(f"TEST_{classname}", f"{classname}_Test")
    return full_class, test_class

def save_refactored_code(style, output, stype):
    count = 0
    for kc,vc in style["data"].items():
        func = output[count]
        with open(code_path + kc + ".java") as f:
            full_code = f.read()
            # print(vc["function range"])
            start_line, end_line = vc["function range"].split("-")
            start_line, start_cursor = start_line.split(",")
            start_line = int(start_line)
            start_cursor = int(start_cursor)
            end_line, end_cursor = end_line.split(",")
            end_line = int(end_line)
            end_cursor = int(end_cursor)
            code_lines = full_code.split("\n")
            first_half = code_lines[:start_line-1]+[code_lines[start_line-1][:start_cursor-1]]
            second_half = [code_lines[end_line-1][end_cursor:]]+code_lines[end_line:]
            refactored_code = "\n".join(first_half + [func] + second_half)
            # print('\n'.join(first_half) + '\n'.join(second_half))
            # print(refactored_code)
            # print("*"*100)

        with open(test_path + f"TEST_{kc}.java") as f:
            test_code = f.read()
        count += 1

        refactored_code, test_code = eliminate_unnecessary_code(refactored_code, test_code, kc)
        # print(refactored_code)
        # print("*"*100)
        with open(save_path + stype + "/" + kc + ".java", "w") as f:
            f.write(refactored_code)
        with open(save_path + stype + "/" + f"{kc}_Test.java", "w") as f:
            f.write(test_code)

style1_refactored_code = save_refactored_code(style1, output1, "style1")
style2_refactored_code = save_refactored_code(style2, output2, "style2")

# for kc,vc in style2["data"].items():
#     print(kc, vc["loc"], output2[count])
#     count += 1

