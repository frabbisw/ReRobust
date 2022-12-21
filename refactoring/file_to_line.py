import os


def file_to_line():
    dataset = ["small", "medium"]
    refactoring_type = ["transformsBooleanExchange", "transformsLogStatement", "transformsLoopExchange",
                        "transformsReorderCondition", "transformsSwitchToIf", "transformsTryCatch"]
    for refactor in refactoring_type:
        for data_size in dataset:

            refactoring_name = convert_refactoring_name(refactor)
            print("start " + refactoring_name + " " + data_size)
            original = "E:/PythonProjects/APR-Models-Performance/data/original/"
            source_buggy = original + data_size + "/" + "test.buggy-fixed.buggy"
            source_fixed = original + data_size + "/" + "test.buggy-fixed.fixed"

            refactoring = "E:/PythonProjects/APR-Models-Performance/data/refactoring/"

            target_bug_file_path_before = refactoring + refactoring_name + "/" + "before_refactoring" + \
                                   "/" + data_size + "/" + "test.buggy-fixed.buggy"
            target_fix_file_path_before = refactoring + refactoring_name + "/" + "before_refactoring" + \
                                   "/" + data_size + "/" + "test.buggy-fixed.fixed"

            target_bug_file_path_after = refactoring + refactoring_name + "/" + "after_refactoring" + \
                                   "/" + data_size + "/" + "test.buggy-fixed.buggy"
            target_fix_file_path_after = refactoring + refactoring_name + "/" + "after_refactoring" + \
                                   "/" + data_size + "/" + "test.buggy-fixed.fixed"
            if not os.path.exists(os.path.dirname(target_bug_file_path_before)):
                os.makedirs(os.path.dirname(target_bug_file_path_before))
            if not os.path.exists(os.path.dirname(target_fix_file_path_before)):
                os.makedirs(os.path.dirname(target_fix_file_path_before))
            if not os.path.exists(os.path.dirname(target_bug_file_path_after)):
                os.makedirs(os.path.dirname(target_bug_file_path_after))
            if not os.path.exists(os.path.dirname(target_fix_file_path_after)):
                os.makedirs(os.path.dirname(target_fix_file_path_after))

            bug_file_dir = original + data_size + "/files/buggy/"
            fix_file_dir = original + data_size + "/files/fixed/"

            target_bug_file_dir = bug_file_dir + refactor + "/"
            target_fix_file_dir = fix_file_dir + refactor + "/"

            target_bug_file_open_before = open(target_bug_file_path_before, 'w', encoding='utf-8')
            target_fix_file_open_before = open(target_fix_file_path_before, 'w', encoding='utf-8')
            target_bug_file_open_after = open(target_bug_file_path_after, 'w', encoding='utf-8')
            target_fix_file_open_after = open(target_fix_file_path_after, 'w', encoding='utf-8')

            buggy_files = os.listdir(target_bug_file_dir)
            fixed_files = os.listdir(target_fix_file_dir)

            source_buggy_lines = open(source_buggy, 'r', encoding='utf-8').readlines()
            source_fixed_lines = open(source_fixed, 'r', encoding='utf-8').readlines()

            count = 0
            for buggy_file_name in buggy_files:

                real_line_number = int(buggy_file_name.split("_")[0])

                buggy_file = target_bug_file_dir + buggy_file_name
                fixed_file = target_fix_file_dir + buggy_file_name
                if not os.path.exists(fixed_file):
                    # print("have buggy, no fixed: " + buggy_file_name)
                    continue
                buggy_file_lines = open(buggy_file, 'r', encoding='utf-8').readlines()
                fixed_file_lines = open(fixed_file, 'r', encoding='utf-8').readlines()

                buggy_text = convert_lines_to_line(buggy_file_lines)
                fixed_text = convert_lines_to_line(fixed_file_lines)

                target_bug_file_open_before.write(source_buggy_lines[real_line_number-1])
                target_fix_file_open_before.write(source_fixed_lines[real_line_number-1])

                target_bug_file_open_after.write(buggy_text + '\n')
                target_fix_file_open_after.write(fixed_text + '\n')

                count += 1

            target_bug_file_open_before.close()
            target_fix_file_open_before.close()
            target_bug_file_open_after.close()
            target_fix_file_open_after.close()

            print("finish " + refactoring_name + " " + data_size + " : " + str(count))


def convert_lines_to_line(lines):
    text = ''
    for line in lines:
        text += line.replace('\n', ' ')
    if text[0] == '@':
        text = text.replace('@', '@ ', 1)

    text = text.replace('(', ' ( ')
    text = text.replace(')', ' ) ')
    text = text.replace('(  )', ' () ')

    while text.__contains__('  '):
        text = text.replace('  ', ' ')

    return text


def convert_refactoring_name(type):
    if type == 'transformsBooleanExchange':
        return "boolean_exchange"
    elif type == 'transformsLogStatement':
        return "insert_log_statement"
    elif type == 'transformsLoopExchange':
        return "loop_exchange"
    elif type == 'transformsReorderCondition':
        return "reorder_condition"
    elif type == 'transformsSwitchToIf':
        return "convert_switch_to_if"
    elif type == 'transformsTryCatch':
        return "insert_try_catch"
    else:
        return "error"


if __name__ == '__main__':
    file_to_line()
