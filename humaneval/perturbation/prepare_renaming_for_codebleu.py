import json
import os
from os.path import join, isfile
from os import listdir
import subprocess

parameter_renaming_path = "/home/frabbi/Downloads/tmp/parameter_renaming.jsonl"
parameter_renaming_fixed_path = "/home/frabbi/Downloads/tmp/parameter_renaming_fixed.jsonl"
variable_renaming_path = "/home/frabbi/Downloads/tmp/local_variable_renaming.jsonl"
variable_renaming_fixed_path = "/home/frabbi/Downloads/tmp/local_variable_renaming_fixed.jsonl"
method_renaming_path = "/home/frabbi/Downloads/tmp/method_renaming.jsonl"
method_renaming_fixed_path = "/home/frabbi/Downloads/tmp/method_renaming_fixed.jsonl"


loc_path = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/renaming/variable_renaming"

# read as jsonlines
with open(parameter_renaming_path, "r") as f:
    parameter_renaming = f.read().split("\n")
    parameter_renaming = [json.loads(x) for x in parameter_renaming if len(x) > 0]
with open(parameter_renaming_fixed_path, "r") as f:
    parameter_renaming_fixed = f.read().split("\n")
    parameter_renaming_fixed = [json.loads(x) for x in parameter_renaming_fixed if len(x) > 0]

with open(variable_renaming_path, "r") as f:
    variable_renaming = f.read().split("\n")
    variable_renaming = [json.loads(x) for x in variable_renaming if len(x) > 0]
with open(variable_renaming_fixed_path, "r") as f:
    variable_renaming_fixed = f.read().split("\n")
    variable_renaming_fixed = [json.loads(x) for x in variable_renaming_fixed if len(x) > 0]

with open(method_renaming_path, "r") as f:
    method_renaming = f.read().split("\n")
    method_renaming = [json.loads(x) for x in method_renaming if len(x) > 0]
with open(method_renaming_fixed_path, "r") as f:
    method_renaming_fixed = f.read().split("\n")
    method_renaming_fixed = [json.loads(x) for x in method_renaming_fixed if len(x) > 0]

org_path = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/buggy/"
tmp_dir = "/home/frabbi/Downloads/tmp/dir/"

buggy_dict = {}

onlyfiles = [f for f in listdir(org_path) if isfile(join(org_path, f))]
for file in onlyfiles:
    with open(join(org_path, file), 'r') as f:
        buggy_dict[file[:file.find(".java")]] = f.read()

# print(len(parameter_renaming))
# print(len(variable_renaming))

target_path_variable = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/alltogether_codebleu/VariableRenaming/buggy/"
target_path_variable_fixed = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/alltogether_codebleu/VariableRenaming/fixed/"
target_path_parameter = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/alltogether_codebleu/ParameterRenaming/buggy/"
target_path_parameter_fixed = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/alltogether_codebleu/ParameterRenaming/fixed/"
target_path_method = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/alltogether_codebleu/MethodRenaming/buggy/"
target_path_method_fixed = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/alltogether_codebleu/MethodRenaming/fixed/"

print(len(parameter_renaming), len(parameter_renaming_fixed))
print(len(variable_renaming), len(variable_renaming_fixed))
print(len(method_renaming), len(method_renaming_fixed))

# print(buggy_dict.keys())

def check_stat(task_renaming, target_paths):
    task_renaming_buggy, task_renaming_fixed = task_renaming
    target_path_buggy, target_path_fixed = target_paths

    renaming_dict = {}

    for renaming in task_renaming_buggy:
        for classname, transformed_code in renaming.items():
            if ".java" in classname:
                classname = classname[:classname.find(".java")]
            renaming_dict[classname] = {"buggy" : transformed_code}
    for renaming in task_renaming_fixed:
        for classname, transformed_code in renaming.items():
            if ".java" in classname:
                classname = classname[:classname.find(".java")]
            renaming_dict[classname]["fixed"] = transformed_code

    os.makedirs(target_path_buggy, exist_ok=True)
    os.makedirs(target_path_fixed, exist_ok=True)

    for classname, code in renaming_dict.items():
        with open(join(target_path_buggy, f"{classname}.java"), "w") as f:
            f.write(code["buggy"])
        with open(join(target_path_fixed, f"{classname}.java"), "w") as f:
            f.write(code["fixed"])

check_stat([variable_renaming, variable_renaming_fixed] , [target_path_variable, target_path_variable_fixed])
check_stat([parameter_renaming, parameter_renaming_fixed] , [target_path_parameter, target_path_parameter_fixed])
check_stat([method_renaming, method_renaming_fixed] , [target_path_method, target_path_method_fixed])
