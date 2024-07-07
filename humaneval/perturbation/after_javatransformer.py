import os
from os.path import join
from os import listdir
from os.path import isfile, join
#
# input_path = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/correct/"
# javatransform_input_path = "/home/frabbi/JavaTransformer/files/input_fixed/"
# output_path = "/home/frabbi/JavaTransformer/files/output_fixed/"
# after_path = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/transformed_fixed/"


input_path = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/buggy/"
javatransform_input_path = "/home/frabbi/JavaTransformer/files/input_data/"
output_path = "/home/frabbi/JavaTransformer/files/output_data/"
after_path = "/home/frabbi/clm/humaneval-java/src/main/java/humaneval/transformed/"

onlydirs = [f for f in listdir(output_path) if not isfile(join(output_path, f))]



def get_full_code(classname, codepart, ftype=None):
    codepart = codepart[:codepart.rfind("}")+1]
    codepart = "\n".join("    " + part for part in codepart.split("\n"))
    # codepart = "\n" + codepart
    # codepart = codepart.replace("\n", "\n    ")
    # codepart = codepart + "\n"

    print(f"##{codepart}##")
    print("===")

    with open(join(input_path, f'{classname}.java'), 'r') as f:
        code_data = f.read()
        methods_start_index = code_data.find("\n", code_data.find(f"public class {classname}")) + 1
        methods_end_index = code_data.rfind("}", 0, code_data.rfind("}")) + 1

    if ftype is not None:
        if ftype == 1:
            with open(join(javatransform_input_path, f'{classname},2,.java'), 'r') as f:
                other_code = f.read()
                fullcode = code_data[:methods_start_index] + codepart + "\n    " + other_code + code_data[methods_end_index:]
        else:
            with open(join(javatransform_input_path, f'{classname},1,.java'), 'r') as f:
                other_code = f.read()
                fullcode = code_data[:methods_start_index] + "" + other_code + "\n" + codepart + code_data[methods_end_index:]

    else:
        fullcode = code_data[:methods_start_index] + codepart + code_data[methods_end_index:]

    return fullcode

for dir in onlydirs:
    tpath = join(output_path, dir)
    onlyfiles = [f for f in listdir(tpath) if isfile(join(tpath, f))]
    for file in onlyfiles:
        if "," in file:
            classname = file[:file.find(",")]
            ftype = int(file[file.find(",")+1:file.rfind(",")])
        else:
            classname = file[:file.rfind("_")]
            ftype = None

        with open(join(tpath, file), 'r') as f:
            codepart = f.read()
            fullcode = get_full_code(classname, codepart, ftype=ftype)
            # print(fullcode)
            # print("*"*100)

        os.makedirs(os.path.dirname(join(join(after_path, dir), file)), exist_ok=True)
        with open(join(join(after_path, dir), file), 'w') as f:
            f.write(fullcode)

