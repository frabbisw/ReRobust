import os
from os.path import join
from os import listdir
from os.path import isfile, join

# input_path = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/correct/"
# output_path = "/home/frabbi/JavaTransformer/files/input_fixed/"

input_path = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/buggy/"
output_path = "/home/frabbi/JavaTransformer/files/input_data/"

onlyfiles = [f for f in listdir(input_path) if isfile(join(input_path, f))]

def parse_methods_from_class(code):
    methods_start_index = data.find("\n", data.find(f"public class {classname}")) + 1
    methods_end_index = data.rfind("}", 0, data.rfind("}")) + 1
    methods = code[methods_start_index:methods_end_index]
    if methods.count("public static") == 1:
        return [methods]
    else:
        second_method_index = methods.find("public static", methods.find("public static") + 1)
        first_method = methods[: 1 + methods.rfind("}", 0, second_method_index)]
        second_method = methods[second_method_index:]
        print(first_method)
        print("---")
        print(second_method)
        print("===")
        return [first_method, second_method]


for file in onlyfiles:
    classname = file.split(".")[0]
    path = join(input_path, file)
    # print(path, file)
    with open(join(input_path, file), 'r') as f:
        data = f.read()
        methods = parse_methods_from_class(data)
        print(f"##{methods[0]}##")
        print("===")
        if len(methods) == 1:
            with open(join(output_path, file), 'w') as f:
                f.write(methods[0])
        else:
            with open(join(output_path, f"{classname},1,.java"), 'w') as f:
                f.write(methods[0])
            with open(join(output_path, f"{classname},2,.java"), 'w') as f:
                f.write(methods[1])
