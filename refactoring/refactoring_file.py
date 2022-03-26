import sys
import os

sys.path.append("..")
import refactoring.refactoring_operators.local_variable_renaming as local_variable_renaming
import refactoring.refactoring_operators.method_renaming as method_renaming
import refactoring.refactoring_operators.parameter_renaming as parameter_renaming


def refactoring_by_operators(opt, buggy, context, fixed):
    # data = util.format_code(data)
    try:
        if opt == 'local_variable_renaming':
            buggy, fixed = local_variable_renaming.refactoring_local_variable_renaming(buggy, context, fixed)
        elif opt == 'method_renaming':
            buggy, fixed = method_renaming.refactoring_method_renaming(buggy, fixed)
        elif opt == 'parameter_renaming':
            buggy, fixed = parameter_renaming.refactoring_parameter_renaming(buggy, fixed)
    except:
        print("except when refactoring")
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

    before_refactored_bug_file_path = open(args.before_refactored_bug_file_path, 'w', encoding='utf-8')
    before_refactored_fix_file_path = open(args.before_refactored_fix_file_path, 'w', encoding='utf-8')

    after_refactored_bug_file_path = open(args.after_refactored_bug_file_path, 'w', encoding='utf-8')
    after_refactored_fix_file_path = open(args.after_refactored_fix_file_path, 'w', encoding='utf-8')

    assert len(bug_file_lines) == len(fix_file_lines)

    total_data = len(bug_file_lines)
    effective_refactoring = []
    effective_refactoring_line_list = []

    for index, bug_file_line in enumerate(bug_file_lines):
        buggy_context_commit = bug_file_line.split('<s>')
        assert len(buggy_context_commit) == 3
        buggy = buggy_context_commit[0]
        context = buggy_context_commit[1]
        commit = buggy_context_commit[2]

        fixed = fix_file_lines[index]
        # if index == 1211:
        #     a = 1
        mutate_buggy, mutate_fixed = refactoring_by_operators(refactoring_type, buggy, context, fixed)

        if mutate_buggy != buggy:
            effective_refactoring.append({index + 1: mutate_buggy})
            effective_refactoring_line_list.append(index)
            # print(index)
            # print(index, '   ', mutate_buggy)
            # print(index, '   ', mutate_fixed)

            # must write before refactored
            before_refactored_bug_file_path.write(bug_file_line)
            before_refactored_fix_file_path.write(fixed)

            bug_file_line_new = bug_file_line.replace(buggy, mutate_buggy)
            fix_file_line_new = mutate_fixed

            after_refactored_bug_file_path.write(bug_file_line_new)
            after_refactored_fix_file_path.write(fix_file_line_new)

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
