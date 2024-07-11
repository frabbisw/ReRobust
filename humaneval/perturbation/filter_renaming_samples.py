import json
import os
from os.path import join, isfile
from os import listdir
import subprocess

parameter_renaming_path = "/home/frabbi/Downloads/tmp/parameter_renaming.jsonl"
variable_renaming_path = "/home/frabbi/Downloads/tmp/local_variable_renaming.jsonl"
method_renaming_path = "/home/frabbi/Downloads/tmp/method_renaming.jsonl"
loc_path = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/renaming/variable_renaming"

# read as jsonlines
with open(parameter_renaming_path, "r") as f:
    parameter_renaming = f.read().split("\n")
    parameter_renaming = [json.loads(x) for x in parameter_renaming if len(x) > 0]

with open(variable_renaming_path, "r") as f:
    variable_renaming = f.read().split("\n")
    variable_renaming = [json.loads(x) for x in variable_renaming if len(x) > 0]

with open(method_renaming_path, "r") as f:
    method_renaming = f.read().split("\n")
    method_renaming = [json.loads(x) for x in method_renaming if len(x) > 0]

org_path = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/buggy/"
tmp_dir = "/home/frabbi/Downloads/tmp/dir/"

buggy_dict = {}

onlyfiles = [f for f in listdir(org_path) if isfile(join(org_path, f))]
for file in onlyfiles:
    with open(join(org_path, file), 'r') as f:
        buggy_dict[file[:file.find(".java")]] = f.read()

# print(len(parameter_renaming))
# print(len(variable_renaming))

target_path_variable = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/alltogether/VariableRenaming/buggy/"
target_path_parameter = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/alltogether/ParameterRenaming/buggy/"
target_path_method = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/alltogether/MethodRenaming/buggy/"

print(len(parameter_renaming))
print(len(variable_renaming))
print(len(method_renaming))

# exit()

# print(buggy_dict.keys())

def check_stat(task_renaming, target_path):
    valid = 0
    errors = 0
    os.chdir(tmp_dir)
    for renaming in task_renaming:
        for classname, transformed_code in renaming.items():
            if ".java" in classname:
                classname = classname[:classname.find(".java")]
            # realcode = buggy_dict[classname]
            # # print(realcode)
            # # print("-"*100)
            # # print(transformed_code)
            # # print("-"*100)
            # method_start_index = realcode.find("(", realcode.find("public class"))
            # method_line_number = realcode[:method_start_index].count("\n")
            # pointer = 0
            # for i in range(method_line_number):
            #     pointer = transformed_code.find("\n", pointer+1)
            # transformed_index = transformed_code.find("(", pointer)
            # transformed_code = realcode[:method_start_index] + transformed_code[transformed_index:]
            # print(transformed_code)
            # print("=" * 100)

            # with open(join(target_path, f"{classname}.java"), "w") as f:
            #     f.write(transformed_code)
            # continue

            with open(join(tmp_dir, f"{classname}.java"), "w") as f:
                f.write(transformed_code.replace("package humaneval.buggy;", ""))
            command = ["javac", f"{classname}.java"]
            try:
                result = subprocess.run(command, capture_output=True, text=True, check=False)
                if result.returncode != 0:
                    # print("ERROR")
                    print(f"{classname}.java", end=" ")
                    errors += 1
                if len(result.stderr) < 3:
                    # print("*"*100)
                    # print(classname)
                    # print("STDERR:", result.stderr)
                    # print("STDOUT:", result.stdout)
                    # print("*"*100)
                    subprocess.run(["rm", f"{classname}.class"])
                    valid+=1
                    with open(join(target_path, f"{classname}.java"), "w") as f:
                        f.write(transformed_code)

            except Exception as e:
                # print(e)
                print(f"{classname}.java", end=" ")
                errors += 1

            subprocess.run(["rm", f"{classname}.java"])

    print()
    print(valid, errors, valid+errors, len(task_renaming))

# check_stat(method_renaming, target_path_method)
