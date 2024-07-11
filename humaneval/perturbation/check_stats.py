import os
from os.path import join
from os import listdir
from os.path import isfile, join


input_path = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/buggy/"
# annotate_path = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/annotate_updated/"
annotate_path = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/annotate_bak/"
onlyfiles = [f for f in listdir(input_path) if isfile(join(input_path, f))]

# info_dict = {}
#
# folders = [f for f in listdir(annotate_path) if not isfile(join(annotate_path, f))]
# for folder in folders:
#     with open(annotate_path + folder + "/src.txt", "r") as f:
#         info = f.read().strip()
#         tt = info.split("/")[-2]
#
#         if tt not in info_dict.keys():
#             info_dict[tt] = 0
#         info_dict[tt] += 1
# sum = 0
# for k, v in info_dict.items():
#     sum += v
#     print(f"{k}: ", v)
#
# print(sum)
#
# exit()

culprints=[]

for file in onlyfiles:
    path = join(input_path, file)

    with open(path, 'r') as f:
        data = f.read()
        if data.count('static') > 1:
            culprints.append(file.split(".")[0])

onlydirs = [f for f in listdir(annotate_path) if not isfile(join(annotate_path, f))]

occs = 0
occs_dict = {}
for occ in culprints:
    occs_dict[occ] = 0

for dir in onlydirs:
    tpath = join(annotate_path, dir)
    loc_path = join(tpath, "buggy_loc.txt")
    with open(loc_path, 'r') as f:
        info = f.read()
        classname, loc = info.split()
        if classname in culprints:
            occs += 1
            occs_dict[classname] += 1
            with open(join(tpath, "transformed.java"), 'r') as f:
                data = f.read()
                print(data)
                print("===")

sum = 0
for k, v in occs_dict.items():
    print(k, v)
    sum += v

print(sum)

