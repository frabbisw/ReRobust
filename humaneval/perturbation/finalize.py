import os
from os.path import join
from os import listdir
from os.path import isfile, join

buggy_path = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/buggy/"
test_Path = "/home/frabbi/clm/humaneval-java/src/test/java/humaneval/"
annotate_path = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/annotate_updated/"
target_path = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/alltogether_codebleu/"
# annotate_path_with_src = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/annotate_bak/"
annotate_path_with_src = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/annotate_fixed/"
src_dict = {}
src_folders = [f for f in listdir(annotate_path_with_src) if not isfile(join(annotate_path_with_src, f))]
for folder in src_folders:
    folder_path = join(annotate_path_with_src, folder)
    with open(join(folder_path, "src.txt"), 'r') as f:
        src = f.read()
        info = src.split("/")
        transformation_type = info[-2]
        classname = info[-1]
        if ',' in classname:
            classname = classname[:classname.find(",")]
        else:
            classname = classname[:classname.rfind("_")]
        src_dict[folder] = {"classname": classname, "transformation_type": transformation_type}

from collections import Counter
print(Counter([v["transformation_type"] for k, v in src_dict.items()]))
# print(src_dict)
# exit()

test_dict = {}
test_files = [f for f in listdir(test_Path) if isfile(join(test_Path, f))]
for file in test_files:
    with open(join(test_Path, file), 'r') as f:
        data = f.read()
        test_dict[file[file.find("_")+1:file.find(".")]] = data

# print(test_dict.keys())
# exit()

class_count = {}
people = [f for f in listdir(annotate_path) if not isfile(join(annotate_path, f))]
for person in people:
    person_path = join(annotate_path, person)
    folders = [f for f in listdir(person_path) if not isfile(join(person_path, f))]
    for folder in folders:
        try:
            classname = src_dict[folder]["classname"]
        except:
            print("Error", folder)
            continue
        transformation_type = src_dict[folder]["transformation_type"]
        if classname not in class_count:
            class_count[classname] = 0
        class_count[classname] += 1
        folder_path = join(person_path, folder)

        target_file_path = f"{target_path}/{transformation_type}/buggy/{classname}_{class_count[classname]}.java"
        target_fixed_file_path = f"{target_path}/{transformation_type}/fixed/{classname}_{class_count[classname]}.java"
        test_file_path = f"{target_path}/{transformation_type}/test/TEST_{classname}_{class_count[classname]}.java"
        loc_path = f"{target_path}/{transformation_type}/humaneval_loc.txt"


        with open(join(folder_path, "transformed.java"), 'r') as f:
            transformed_code = f.read()
        with open(join(annotate_path_with_src, folder, "transformed_fixed.java")) as f:
            transformed_fixed_code = f.read()
        with open(join(folder_path, "buggy_loc.txt"), 'r') as f:
            loc = f.read().strip()
            loc = loc.split(" ")[-1].strip()

        os.makedirs(os.path.dirname(target_file_path), exist_ok=True)
        os.makedirs(os.path.dirname(test_file_path), exist_ok=True)
        os.makedirs(os.path.dirname(target_fixed_file_path), exist_ok=True)

        # if "MAXIMUM" in classname:
        #     print(classname, transformation_type, loc)

        with open(loc_path, 'a') as f:
            f.write(f"{classname}_{class_count[classname]} {loc}\n")
        with open(target_file_path, 'w') as f:
            f.write(transformed_code.replace(f"{classname}", f"{classname}_{class_count[classname]}"))
        with open(target_fixed_file_path, 'w') as f:
            f.write(transformed_fixed_code.replace(f"{classname}", f"{classname}_{class_count[classname]}"))
        with open(test_file_path, 'w') as f:
            f.write(test_dict[classname].replace(f"{classname}", f"{classname}_{class_count[classname]}"))



