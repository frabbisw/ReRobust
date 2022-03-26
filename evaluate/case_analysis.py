import argparse


def main():
    parser = argparse.ArgumentParser(description='generate correct lines from test result.')
    parser.add_argument('--prediction_file_before_refactoring')
    parser.add_argument('--prediction_file_after_refactoring')
    parser.add_argument('--source_buggy_file_before_refactoring')
    parser.add_argument('--source_buggy_file_after_refactoring')
    parser.add_argument('--source_fixed_file_before_refactoring')
    parser.add_argument('--source_fixed_file_after_refactoring')
    parser.add_argument('--cases_before_correct_after_incorrect')
    parser.add_argument('--cases_before_incorrect_after_correct')
    parser.add_argument('--cases_before_correct_after_correct')
    parser.add_argument('--cases_before_incorrect_after_incorrect')
    args = parser.parse_args()

    prediction_file_before_refactoring = [x.strip() for x in open(args.prediction_file_before_refactoring, 'r',
                                                                  encoding='utf-8').readlines()]
    prediction_file_after_refactoring = [x.strip() for x in open(args.prediction_file_after_refactoring, 'r',
                                                                 encoding='utf-8').readlines()]
    source_buggy_file_before_refactoring = [x.strip() for x in open(args.source_buggy_file_before_refactoring, 'r',
                                                                    encoding='utf-8').readlines()]
    source_buggy_file_after_refactoring = [x.strip() for x in open(args.source_buggy_file_after_refactoring, 'r',
                                                                   encoding='utf-8').readlines()]
    source_fixed_file_before_refactoring = [x.strip() for x in open(args.source_fixed_file_before_refactoring, 'r',
                                                                    encoding='utf-8').readlines()]
    source_fixed_file_after_refactoring = [x.strip() for x in open(args.source_fixed_file_after_refactoring, 'r',
                                                                   encoding='utf-8').readlines()]
    cases_before_correct_after_incorrect = open(args.cases_before_correct_after_incorrect, 'w', encoding='utf-8')
    cases_before_incorrect_after_correct = open(args.cases_before_incorrect_after_correct, 'w', encoding='utf-8')
    cases_before_correct_after_correct = open(args.cases_before_correct_after_correct, 'w', encoding='utf-8')
    cases_before_incorrect_after_incorrect = open(args.cases_before_incorrect_after_incorrect, 'w', encoding='utf-8')

    assert len(prediction_file_before_refactoring) == len(prediction_file_after_refactoring) and len(
        source_buggy_file_before_refactoring) == len(source_fixed_file_after_refactoring)

    length = len(prediction_file_before_refactoring)
    correct_count_before = 0
    correct_count_after = 0

    for i in range(length):
        pb = prediction_file_before_refactoring[i]
        pa = prediction_file_after_refactoring[i]
        bb = source_buggy_file_before_refactoring[i]
        ba = source_buggy_file_after_refactoring[i]
        fb = source_fixed_file_before_refactoring[i]
        fa = source_fixed_file_after_refactoring[i]

        if fb == pb:
            correct_count_before += 1
        if fa == pa:
            correct_count_after += 1

        line_index = i + 1
        if fb == pb and fa != pa:
            cases_before_correct_after_incorrect.write('line_index: ' + str(line_index) + '\n')
            cases_before_correct_after_incorrect.write('bug_before_refactoring: ' + bb + '\n')
            cases_before_correct_after_incorrect.write('bug_after_refactoring: ' + ba + '\n')
            cases_before_correct_after_incorrect.write('fix_before_refactoring: ' + fb + '\n')
            cases_before_correct_after_incorrect.write('fix_after_refactoring: ' + fa + '\n')
            cases_before_correct_after_incorrect.write('√ fix_prediction_before: ' + pb + '\n')
            cases_before_correct_after_incorrect.write('× fix_prediction_after: ' + pa + '\n')
            cases_before_correct_after_incorrect.write('\n')
        if fb != pb and fa == pa:
            cases_before_incorrect_after_correct.write('line_index: ' + str(line_index) + '\n')
            cases_before_incorrect_after_correct.write('bug_before_refactoring: ' + bb + '\n')
            cases_before_incorrect_after_correct.write('bug_after_refactoring: ' + ba + '\n')
            cases_before_incorrect_after_correct.write('fix_before_refactoring: ' + fb + '\n')
            cases_before_incorrect_after_correct.write('fix_after_refactoring: ' + fa + '\n')
            cases_before_incorrect_after_correct.write('× fix_prediction_before: ' + pb + '\n')
            cases_before_incorrect_after_correct.write('√ fix_prediction_after: ' + pa + '\n')
            cases_before_incorrect_after_correct.write('\n')
        if fb == pb and fa == pa:
            cases_before_correct_after_correct.write('line_index: ' + str(line_index) + '\n')
            cases_before_correct_after_correct.write('bug_before_refactoring: ' + bb + '\n')
            cases_before_correct_after_correct.write('bug_after_refactoring: ' + ba + '\n')
            cases_before_correct_after_correct.write('fix_before_refactoring: ' + fb + '\n')
            cases_before_correct_after_correct.write('fix_after_refactoring: ' + fa + '\n')
            cases_before_correct_after_correct.write('√ fix_prediction_before: ' + pb + '\n')
            cases_before_correct_after_correct.write('√ fix_prediction_after: ' + pa + '\n')
            cases_before_correct_after_correct.write('\n')
        if fb != pb and fa != pa:
            cases_before_incorrect_after_incorrect.write('line_index: ' + str(line_index) + '\n')
            cases_before_incorrect_after_incorrect.write('bug_before_refactoring: ' + bb + '\n')
            cases_before_incorrect_after_incorrect.write('bug_after_refactoring: ' + ba + '\n')
            cases_before_incorrect_after_incorrect.write('fix_before_refactoring: ' + fb + '\n')
            cases_before_incorrect_after_incorrect.write('fix_after_refactoring: ' + fa + '\n')
            cases_before_incorrect_after_incorrect.write('× fix_prediction_before: ' + pb + '\n')
            cases_before_incorrect_after_incorrect.write('× fix_prediction_after: ' + pa + '\n')
            cases_before_incorrect_after_incorrect.write('\n')


    cases_before_correct_after_incorrect.close()
    cases_before_incorrect_after_correct.close()
    cases_before_correct_after_correct.close()
    cases_before_incorrect_after_incorrect.close()

    correct_acc_before = round(correct_count_before / length * 100, 2)
    correct_acc_after = round(correct_count_after / length * 100, 2)

    print('Total: ', length)
    print('correct_count_before: ', correct_count_before, ' correct_acc_before: ', correct_acc_before)
    print('correct_count_after: ', correct_count_after, ' correct_acc_after: ', correct_acc_after)


if __name__ == '__main__':
    main()

