import os


def line_to_file():
    # bug_file = "E:/PythonProjects/APR-Models-Performance/data/original/small/test.buggy-fixed.buggy"
    # fix_file = "E:/PythonProjects/APR-Models-Performance/data/original/small/test.buggy-fixed.fixed"
    # target_bug_file_path = "E:/PythonProjects/APR-Models-Performance/data/original/small/files/buggy/"
    # target_fix_file_path = "E:/PythonProjects/APR-Models-Performance/data/original/small/files/fixed/"

    bug_file = "E:/PythonProjects/APR-Models-Performance/data/original/medium/test.buggy-fixed.buggy"
    fix_file = "E:/PythonProjects/APR-Models-Performance/data/original/medium/test.buggy-fixed.fixed"
    target_bug_file_path = "E:/PythonProjects/APR-Models-Performance/data/original/medium/files/buggy/"
    target_fix_file_path = "E:/PythonProjects/APR-Models-Performance/data/original/medium/files/fixed/"

    if not os.path.exists(os.path.dirname(target_bug_file_path)):
        os.makedirs(os.path.dirname(target_bug_file_path))
    if not os.path.exists(os.path.dirname(target_fix_file_path)):
        os.makedirs(os.path.dirname(target_fix_file_path))

    bug_file_lines = open(bug_file, 'r', encoding='utf-8').readlines()
    fix_file_lines = open(fix_file, 'r', encoding='utf-8').readlines()
    assert len(bug_file_lines) == len(fix_file_lines)

    for index, bug_file_line in enumerate(bug_file_lines):
        name = str(index + 1) + '.java'
        target_bug_file = target_bug_file_path + name
        target_fix_file = target_fix_file_path + name

        target_bug_file_open = open(target_bug_file, 'w', encoding='utf-8')
        target_fix_file_open = open(target_fix_file, 'w', encoding='utf-8')

        target_bug_file_open.write(bug_file_line)
        target_fix_file_open.write(fix_file_lines[index])

        target_bug_file_open.close()
        target_fix_file_open.close()
        print(index)


if __name__ == '__main__':
    line_to_file()
