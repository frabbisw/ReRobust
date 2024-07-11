import json
import os
from os.path import join, isfile
from os import listdir
import subprocess
import difflib

transformed_path_method = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/alltogether_codebleu/MethodRenaming/buggy/"
test_path_method = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/alltogether_codebleu/MethodRenaming/test/"
method_renaming_info = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/alltogether/MethodRenaming/original_transformed_method_map.jsonl"

for line in open(method_renaming_info, "r"):
    data = json.loads(line)
    for classname,v in data.items():
        if ".java" in classname:
            classname = classname[:classname.find(".java")]
        for old_method_name, new_method_name in v.items():
            print(classname, old_method_name, new_method_name)
            with open(join(test_path_method, f"TEST_{classname}.java"), 'r') as f:
                test_code = f.read()
            new_test_code = test_code.replace(f"humaneval.buggy.{classname}.{old_method_name}", f"humaneval.buggy.{classname}.{new_method_name}")
            with open(join(test_path_method, f"TEST_{classname}.java"), 'w') as f:
                f.write(new_test_code)
