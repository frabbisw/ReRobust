import os
from os.path import join
def get_line_to_classnames_dict():
    line_to_classnames = {}
    count = 0
    with open("../data/buggy_names.txt") as f:
        lines = f.read().split("\n")
        for classname in lines:
            if len(classname) < 1:
                continue
            line_to_classnames[str(count)] = classname
            count += 1
    return line_to_classnames
classnames_dict = get_line_to_classnames_dict()
def get_full_class(classname):
    with open(join("clm/humaneval-java/humaneval-java/src/main/java/humaneval/correct", classname + ".java"), "r") as f:
        return f.read()
def get_test_class(classname):
    with open(join("clm/humaneval-java/humaneval-java/src/test/java/humaneval", f"TEST_{classname}" + ".java"), "r") as f:
        return f.read()

# print(classnames_dict[109])
# exit()
refactoring_types = ["boolean_exchange", "insert_log_statement", "insert_try_catch", "loop_exchange", "reorder_condition"] #, eliminating "convert_switch_to_if"
whether_refactor = ["before_refactoring", "after_refactoring"]
refactor_path = "../result/refactoring/modit/"
code_path = "../data/java_codes/"

for t in refactoring_types:
    classname_list = []
    for w in whether_refactor:
        with open(f"data/{t}.txt", "r") as f:
            lines = f.read().split("\n")
            for line in lines:
                if len(line) < 1:
                    break
                classname_list.append(classnames_dict[line])

        with open(join(join(join(refactor_path, t), w), "output.hyp"), "r") as fbuggy:
            lines = fbuggy.read().split("\n")
            for i in range(len(lines)):
                if len(lines[i]) < 1:
                    break
                method = lines[i]
                classname = classname_list[i]
                full_class = get_full_class(classname)
                full_class = full_class[:full_class.find(f"public class {classname}")]
                full_class = full_class + f"public class {classname} " + "{ " + f"{method}" + " }"
                test_class = get_test_class(classname)

                full_class = full_class.replace("package humaneval.correct;\n\n", "")
                full_class = full_class.replace("package humaneval.correct;\n", "")
                full_class = full_class.replace("package humaneval.correct;", "")
                test_class = test_class.replace("package humaneval;\n\n", "")
                test_class = test_class.replace("package humaneval;\n", "")
                test_class = test_class.replace("package humaneval;", "")
                test_class = test_class.replace("humaneval.buggy.", "")
                test_class = test_class.replace(f"TEST_{classname}", f"{classname}_Test")

                os.makedirs(os.path.dirname(code_path + f"{t}/{w}/hyp/{classname}.java"), exist_ok=True)
                with open(code_path + f"{t}/{w}/hyp/{classname}.java", "w") as f:
                    f.write(full_class)
                with open(code_path + f"{t}/{w}/hyp/{classname}_Test.java", "w") as f:
                    f.write(test_class)

        with open(join(join(join(refactor_path, t), w), "output.ref"), "r") as ffixed:
            lines = ffixed.read().split("\n")
            for i in range(len(lines)):
                if len(lines[i]) < 1:
                    break
                method = lines[i]
                classname = classname_list[i]
                full_class = get_full_class(classname)
                full_class = full_class[:full_class.find(f"public class {classname}")]
                full_class = full_class + f"public class {classname} " + "{ " + f"{method}" + " }"
                test_class = get_test_class(classname)

                full_class = full_class.replace("package humaneval.correct;\n\n", "")
                full_class = full_class.replace("package humaneval.correct;\n", "")
                full_class = full_class.replace("package humaneval.correct;", "")
                test_class = test_class.replace("package humaneval;\n\n", "")
                test_class = test_class.replace("package humaneval;\n", "")
                test_class = test_class.replace("package humaneval;", "")
                test_class = test_class.replace("humaneval.buggy.", "")
                test_class = test_class.replace(f"TEST_{classname}", f"{classname}_Test")

                os.makedirs(os.path.dirname(code_path + f"{t}/{w}/ref/{classname}.java"), exist_ok=True)
                with open(code_path + f"{t}/{w}/ref/{classname}.java", "w") as f:
                    f.write(full_class)
                with open(code_path + f"{t}/{w}/ref/{classname}_Test.java", "w") as f:
                    f.write(test_class)