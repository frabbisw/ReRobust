import os
from os.path import isfile, join, isdir
from os import listdir
import json

src_file_t5 = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/alltogether_bak/Original/codet5/codet5_input_c1.json"
src_file_bart = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/alltogether_bak/Original/plbart/plbart_input_c1.json"

def get_res(path):
    with open(path, 'r') as f:
        data = json.load(f)
        config = data["config"]
        data = data["data"]
        tokens_len = 0
        for classname, info in data.items():
            tokens_len += len(info["input"].split())
        print(tokens_len, len(data), tokens_len/len(data))

get_res(src_file_t5)
get_res(src_file_bart)