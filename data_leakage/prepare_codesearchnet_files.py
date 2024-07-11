import os
import json
from tqdm import tqdm as tq
import pandas as pd

src = "/home/frabbi/tmp/code_search_net/train"
target = "/home/frabbi/tmp/code_search_net/files"
only_files = [f for f in os.listdir(src) if f.endswith(".jsonl")]

for idx, file in tq(enumerate(only_files)):
    os.makedirs(os.path.join(target, f"{idx}"), exist_ok=True)
    file_number = 0
    df = pd.read_json(os.path.join(src, file), lines=True)
    for code in df["code"]:
        with open(os.path.join(target, f"{idx}", f"{file_number}.java"), "w") as f2:
            f2.write(code)
            file_number += 1

    # with open(os.path.join(src, file), "r") as f:
    #     lines = f.readlines()
    #     for line in lines:
    #         line = json.loads(line)
    #         with open(os.path.join(target, f"{idx}", f"{file_number}.java"), "w") as f2:
    #             f2.write(line["code"])
    #             file_number += 1
            # print(line["code"])
            # if file_number == 100:
            #     exit()
