import os
from random import sample

src = "/home/frabbi/tmp/bfps/concreteBFPs"
target = "/home/frabbi/tmp/bfps/concreteBFPsFiles"
NUMBER_OF_SAMPLE = 385

for size in ["small", "medium"]:
    for data_type in ["train", "test"]:
        src_file = os.path.join(src, size, f"{data_type}.buggy-fixed.buggy")
        target_folder = os.path.join(target, size, data_type, "buggy")
        os.makedirs(target_folder, exist_ok=True)

        with open(src_file, "r") as f:
            if data_type == "train":
                lines = f.readlines()
            elif data_type == "test":
                lines = sample(f.readlines(), NUMBER_OF_SAMPLE)

            for idx, line in enumerate(lines):
                with open(os.path.join(target_folder, f"{idx}.java"), "w") as f2:
                    f2.write(line)


