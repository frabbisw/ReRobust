import os
from os import listdir
from os.path import isfile, join

buggy_path = "../clm/humaneval-java/src/main/java/humaneval/buggy"
fixed_path = "../clm/humaneval-java/src/main/java/humaneval/correct"

def get_codes(path):
    lines = []
    classnames = []
    onlyfiles = [f for f in listdir(path) if isfile(join(path, f))]
    for filename in onlyfiles:
        with open(join(path, filename), 'r') as file:
            contents = file.read()
            class_start = contents.find(f"public class {filename[:-5]}")
            code = contents[class_start:]
            code = code.replace("\n", " ").replace("\t", " ")\
                .replace("{", " { ").replace("}", " } ")\
                .replace("(", " ( ").replace(")", " ) ")\
                .replace("<", " < ").replace(">", " > ")\
                .replace("[", " [ ").replace("]", " ] ")
            code = " ".join(code.split())
            method = code[len(f"public class {filename[:-5]} ")+2:-2]
            # print(method)
            lines.append(method)
            classnames.append(filename[:-5])
    return lines, classnames

buggy_codes, buggy_names = get_codes(buggy_path)
fixed_codes, fixed_names = get_codes(fixed_path)

with open("../data/test.buggy-fixed.buggy", "w") as file:
    file.write("\n".join(buggy_codes))
with open("../data/test.buggy-fixed.fixed", "w") as file:
    file.write("\n".join(fixed_codes))
with open("../data/buggy_names.txt", "w") as file:
    file.write("\n".join(buggy_names))
with open("../data/fixed_names.txt", "w") as file:
    file.write("\n".join(fixed_names))
# print(buggy_codes)
# print(fixed_codes)