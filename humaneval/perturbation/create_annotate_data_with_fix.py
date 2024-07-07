import os
from os.path import join
from os import listdir
from os.path import isfile, join

buggy_path = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/buggy/"
fixed_path = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/correct/"
output_path_buggy = "/home/frabbi/JavaTransformer/files/output_data/"
output_path_fixed = "/home/frabbi/JavaTransformer/files/output_fixed/"
transformed_path_buggy = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/transformed/"
transformed_path_fixed = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/transformed_fixed/"
annotate_path_buggy = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/annotate/"
annotate_path_fixed = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/annotate_fixed/"
loc_file = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/humaneval_loc.txt"

loc_dict = {}
buggy_files_dict = {}
fixed_files_dict = {}

with open(loc_file, 'r') as f:
    lines = f.readlines()
    for line in lines:
        classname, rem_loc = line.strip().split()
        classname = classname.strip()
        loc_dict[classname] = rem_loc.strip()

buggyfiles = [f for f in listdir(buggy_path) if isfile(join(buggy_path, f))]
for bfile in buggyfiles:
    classname = bfile[:bfile.rfind(".")]
    with open(join(buggy_path, bfile), 'r') as f:
        buggy_files_dict[classname] = f.read()

fixedfiles = [f for f in listdir(fixed_path) if isfile(join(fixed_path, f))]
for ffile in fixedfiles:
    classname = ffile[:ffile.rfind(".")]
    with open(join(fixed_path, ffile), 'r') as f:
        fixed_files_dict[classname] = f.read()

transdirs_buggy = [f for f in listdir(transformed_path_buggy) if not isfile(join(transformed_path_buggy, f))]
transdirs_fixed = [f for f in listdir(transformed_path_fixed) if not isfile(join(transformed_path_fixed, f))]

print(loc_dict)
print(buggy_files_dict.keys())
print(fixed_files_dict.keys())
# exit(0)

import random

# numbers = list(range(1, 973))
# numbers = random.sample(numbers, len(numbers))
# print(numbers)
# exit(0)
count = 0
for dir in transdirs_buggy:
    print(dir)
    onlyfiles = [f for f in listdir(join(transformed_path_buggy, dir)) if isfile(join(join(transformed_path_buggy, dir), f))]
    for file in onlyfiles:
        # single_folder = join(annotate_path, str(numbers[count]))
        single_folder = join(annotate_path_fixed, str(count))
        count += 1
        if ',' in file:
            classname = file[:file.find(",")]
        else:
            classname = file[:file.rfind("_")]
        org_path_buggy = join(transformed_path_buggy, dir, file)
        org_path_fixed = org_path_buggy.replace("transformed", "transformed_fixed")
        print(org_path_fixed)

        loc = loc_dict[classname]
        buggy_code = buggy_files_dict[classname]
        fixed_code = fixed_files_dict[classname]
        with open(org_path_buggy, 'r') as f:
            transformed_code_buggy = f.read()
        with open(org_path_fixed, 'r') as f:
            transformed_code_fixed = f.read()

        # print(single_folder)
        # exit(0)
        os.makedirs(single_folder, exist_ok=True)
        with open(join(single_folder, "buggy.java"), 'w') as f:
            f.write(buggy_code)
        # with open(join(single_folder, "fixed.java"), 'w') as f:
        #     f.write(fixed_code)
        with open(join(single_folder, "transformed.java"), 'w') as f:
            f.write(transformed_code_buggy)
        with open(join(single_folder, "transformed_fixed.java"), 'w') as f:
            f.write(transformed_code_fixed)
        with open(join(single_folder, "buggy_loc.txt"), 'w') as f:
            f.write(f"{classname} {loc}")
        with open(join(single_folder, "new_loc.txt"), 'w') as f:
            f.write(f"")
        # with open(join(single_folder, "src.txt"), 'w') as f:
        #     f.write(org_path)