import sys
import os
import json

sys.path.append("..")
import refactoring.refactoring_operators.local_variable_renaming as local_variable_renaming
import refactoring.refactoring_operators.method_renaming as method_renaming
import refactoring.refactoring_operators.parameter_renaming as parameter_renaming


# def refactoring_by_operators(opt, buggy, context, fixed):
#     # data = util.format_code(data)
#     try:
#         if opt == 'local_variable_renaming':
#             buggy, fixed = local_variable_renaming.refactoring_local_variable_renaming(buggy, context, fixed)
#         elif opt == 'method_renaming':
#             buggy, fixed = method_renaming.refactoring_method_renaming(buggy, fixed)
#         elif opt == 'parameter_renaming':
#             buggy, fixed = parameter_renaming.refactoring_parameter_renaming(buggy, fixed)
#     except:
#         print("except when refactoring")
#         pass
#     # verify_method_syntax(after)
#     return buggy, fixed

def refactoring_by_operators(opt, buggy, fixed, substitutes_dict):
    # data = util.format_code(data)
    try:
        if opt == 'local_variable_renaming':
            buggy, fixed = local_variable_renaming.refactoring_local_variable_renaming(buggy, fixed, substitutes_dict)
        elif opt == 'method_renaming':
            buggy, fixed = method_renaming.refactoring_method_renaming(buggy, fixed, substitutes_dict)
        elif opt == 'parameter_renaming':
            buggy, fixed = parameter_renaming.refactoring_parameter_renaming(buggy, fixed, substitutes_dict)
    except Exception as e:
        print("except when refactoring", e)
        pass
    # verify_method_syntax(after)
    return buggy, fixed


def refactoring_file():
    import argparse
    parser = argparse.ArgumentParser(description='refactoring information')
    parser.add_argument('--refactoring_type',
                        help="refactoring_type can be 'local_variable_renaming', 'method_renaming', 'parameter_renaming'")
    parser.add_argument('--bug_file', help="bug file")
    parser.add_argument('--fix_file', help="fix file")
    parser.add_argument('--before_refactored_bug_file_path', help="before_refactored_bug_file_path")
    parser.add_argument('--before_refactored_fix_file_path', help="before_refactored_fix_file_path")
    parser.add_argument('--after_refactored_bug_file_path', help="after_refactored_bug_file_path")
    parser.add_argument('--after_refactored_fix_file_path', help="after_refactored_fix_file_path")

    args = parser.parse_args()

    refactoring_type = args.refactoring_type
    bug_file_lines = open(args.bug_file, 'r', encoding='utf-8').readlines()
    fix_file_lines = open(args.fix_file, 'r', encoding='utf-8').readlines()

    if not os.path.exists(os.path.dirname(args.before_refactored_bug_file_path)):
        os.makedirs(os.path.dirname(args.before_refactored_bug_file_path))
    if not os.path.exists(os.path.dirname(args.before_refactored_fix_file_path)):
        os.makedirs(os.path.dirname(args.before_refactored_fix_file_path))

    if not os.path.exists(os.path.dirname(args.after_refactored_bug_file_path)):
        os.makedirs(os.path.dirname(args.after_refactored_bug_file_path))
    if not os.path.exists(os.path.dirname(args.after_refactored_fix_file_path)):
        os.makedirs(os.path.dirname(args.after_refactored_fix_file_path))

    # before_refactored_bug_file_path = open(args.before_refactored_bug_file_path, 'w', encoding='utf-8')
    # before_refactored_fix_file_path = open(args.before_refactored_fix_file_path, 'w', encoding='utf-8')
    #
    # after_refactored_bug_file_path = open(args.after_refactored_bug_file_path, 'w', encoding='utf-8')
    # after_refactored_fix_file_path = open(args.after_refactored_fix_file_path, 'w', encoding='utf-8')

    before_refactored_bug_file_path = open(args.before_refactored_bug_file_path, 'w', encoding='utf-8')
    before_refactored_fix_file_path = open(args.before_refactored_fix_file_path, 'w', encoding='utf-8')

    after_refactored_bug_file_path = open(args.after_refactored_bug_file_path, 'w', encoding='utf-8')
    after_refactored_fix_file_path = open(args.after_refactored_fix_file_path, 'w', encoding='utf-8')

    assert len(bug_file_lines) == len(fix_file_lines)




    # refactoring_type = "local_variable_renaming"
    # bug_file = "E:/PythonProjects/APR-Models-Performance/data/original/small/test.buggy-fixed.buggy"
    # fix_file = "E:/PythonProjects/APR-Models-Performance/data/original/small/test.buggy-fixed.fixed"
    # bug_file_lines = open(bug_file, 'r', encoding='utf-8').readlines()
    # fix_file_lines = open(fix_file, 'r', encoding='utf-8').readlines()
    #
    # before_refactored_bug_file_path = "E:/PythonProjects/APR-Models-Performance/data/refactoring/local_variable_renaming/before_refactoring/small/test.buggy-fixed.buggy"
    # before_refactored_fix_file_path = "E:/PythonProjects/APR-Models-Performance/data/refactoring/local_variable_renaming/before_refactoring/small/test.buggy-fixed.fixed"
    # after_refactored_bug_file_path = "E:/PythonProjects/APR-Models-Performance/data/refactoring/local_variable_renaming/after_refactoring/small/test.buggy-fixed.buggy"
    # after_refactored_fix_file_path = "E:/PythonProjects/APR-Models-Performance/data/refactoring/local_variable_renaming/after_refactoring/small/test.buggy-fixed.fixed"
    #
    # before_refactored_bug_file_path = open(before_refactored_bug_file_path, 'w', encoding='utf-8')
    # before_refactored_fix_file_path = open(before_refactored_fix_file_path, 'w', encoding='utf-8')
    # after_refactored_bug_file_path = open(after_refactored_bug_file_path, 'w', encoding='utf-8')
    # after_refactored_fix_file_path = open(after_refactored_fix_file_path, 'w', encoding='utf-8')


    assert len(bug_file_lines) == len(fix_file_lines)
    total_data = len(bug_file_lines)
    effective_refactoring = []
    effective_refactoring_line_list = []

    substitutes_dataset = './humaneval_java_substitutes.jsonl'

    print("substitutes_dataset: " + substitutes_dataset)
    substitutes = []
    with open(substitutes_dataset) as f:
        for line in f:
            js = json.loads(line.strip())
            substitutes.append(js["substitutes"])

    for index, bug_file_line in enumerate(bug_file_lines):
        # buggy_context_commit = bug_file_line.split('<s>')
        # assert len(buggy_context_commit) == 3
        # buggy = buggy_context_commit[0]
        # context = buggy_context_commit[1]
        # commit = buggy_context_commit[2]


        buggy = json.loads(bug_file_line)['code']
        fixed = json.loads(fix_file_lines[index])['code']
        # if index == 1211:
        #     a = 1
        # mutate_buggy, mutate_fixed = refactoring_by_operators(refactoring_type, buggy, context, fixed)

        mutate_buggy, mutate_fixed = refactoring_by_operators(refactoring_type, buggy, fixed, substitutes[index])


        if mutate_buggy != buggy:
            effective_refactoring.append({index + 1: mutate_buggy})
            effective_refactoring_line_list.append(index)
            # print(index)
            # print(index, '   ', mutate_buggy)
            # print(index, '   ', mutate_fixed)

            # must write before refactoredjavalang
            before_refactored_bug_file_path.write(json.dumps({'code': buggy}) + '\n')
            before_refactored_fix_file_path.write(json.dumps({'code': fixed}) + '\n')

            # bug_file_line_new = bug_file_line.replace(buggy, mutate_buggy)
            bug_file_line_new = mutate_buggy
            fix_file_line_new = mutate_fixed

            after_refactored_bug_file_path.write(json.dumps({'code': bug_file_line_new}) + '\n')
            after_refactored_fix_file_path.write(json.dumps({'code': fix_file_line_new}) + '\n')

    before_refactored_bug_file_path.close()
    before_refactored_fix_file_path.close()

    after_refactored_bug_file_path.close()
    after_refactored_fix_file_path.close()

    effective_refactoring_size = len(effective_refactoring_line_list)
    refactoring_rate = effective_refactoring_size / total_data
    print('effective_refactoring_size: ', effective_refactoring_size, ' total: ', total_data,
          ' refactoring percentage: {:.2%}'.format(refactoring_rate))
    # print('effective_refactoring: ', effective_refactoring)


if __name__ == '__main__':
    refactoring_file()
