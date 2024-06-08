import json
import os
from os.path import join, isfile
from os import listdir
import subprocess
import difflib

loc_path = "/home/frabbi/clm/clm-apr/humaneval/humaneval_loc.txt"
buggy_path = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/buggy/"
test_path = "/home/frabbi/clm/humaneval-java/src/test/java/humaneval/"

# buggy_dict = {}
# onlyfiles = [f for f in listdir(buggy_path) if isfile(join(buggy_path, f))]
# for file in onlyfiles:
#     with open(join(buggy_path, file), 'r') as f:
#         buggy_dict[file[:file.find(".java")]] = f.read()

loc_dict = {}
with open(loc_path, 'r') as f:
    locs = f.read().split("\n")
    for loc in locs:
        if len(loc) > 0:
            classname, number = loc.split()
            loc_dict[classname.strip()] = loc

transformed_path_variable = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/alltogether_codebleu/VariableRenaming/buggy/"
transformed_path_parameter = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/alltogether_codebleu/ParameterRenaming/buggy/"
transformed_path_method = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/alltogether_codebleu/MethodRenaming/buggy/"

transformed_fixed_path_variable = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/alltogether_codebleu/VariableRenaming/fixed/"
transformed_fixed_path_parameter = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/alltogether_codebleu/ParameterRenaming/fixed/"
transformed_fixed_path_method = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/alltogether_codebleu/MethodRenaming/fixed/"

test_path_variable = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/alltogether_codebleu/VariableRenaming/test/"
test_path_parameter = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/alltogether_codebleu/ParameterRenaming/test/"
test_path_method = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/alltogether_codebleu/MethodRenaming/test/"

loc_path_variable = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/alltogether_codebleu/VariableRenaming/humaneval_loc.txt"
loc_path_parameter = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/alltogether_codebleu/ParameterRenaming/humaneval_loc.txt"
loc_path_method = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/alltogether_codebleu/MethodRenaming/humaneval_loc.txt"


def prepare_test(transformed_path, test_transformed_path, transformed_loc_path):
    with open(transformed_loc_path, 'w') as f:
        f.write("")

    only_files = [f for f in listdir(transformed_path) if isfile(join(transformed_path, f))]
    for file in only_files:
        classname = file[:file.find(".java")]
        with open(join(test_path, f"TEST_{classname}.java"), 'r') as f:
            test_code = f.read()
        with open(join(test_transformed_path, f"TEST_{classname}.java"), 'w') as f:
            f.write(test_code)
        with open(transformed_loc_path, 'a') as f:
            f.write(loc_dict[classname]+"\n")

# prepare_test(transformed_path_variable, test_path_variable, loc_path_variable)
# prepare_test(transformed_path_parameter, test_path_parameter, loc_path_parameter)
# prepare_test(transformed_path_method, test_path_method, loc_path_method)
