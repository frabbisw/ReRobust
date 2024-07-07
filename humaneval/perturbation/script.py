def get_line_dict():
    line_dict = {}
    with open("../data/buggy_names.txt", "r") as f:
        lines = f.read().split("\n")
        for i, line in enumerate(lines):
            # print(line, i)
            line_dict[line] = i
    return line_dict

def get_line_numbers(refactor_type, line_dict):
    numbers = []
    with open(f"{refactor_type}/before_refactoring/test.buggy-fixed.buggy", "r") as f:
        lines = f.read().split("\n")
        # print(len(lines))
        for line in lines:
            class_name = line.split(" {")[0][len("public class "):]
            if len(class_name) > 0:
                line_number = line_dict[class_name]
                numbers.append(str(line_number))
                # print(class_name, line_number)
    with open(f"../data/{refactor_type}.txt", "w") as f:
        f.write("\n".join(numbers))
    return numbers

line_dict = get_line_dict()

get_line_numbers("parameter_renaming", line_dict)
get_line_numbers("method_renaming", line_dict)
get_line_numbers("local_variable_renaming", line_dict)