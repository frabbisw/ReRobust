import argparse


def main():
    parser = argparse.ArgumentParser(description='generate correct lines from test result.')
    parser.add_argument('--predictions', help="filename of the leaderboard predictions, in txt format.")
    parser.add_argument('--source_buggy_file', help="filename of the source buggy file, in txt format.")
    parser.add_argument('--source_fixed_file', help="filename of the source fixed file, in txt format.")

    parser.add_argument('--move_source_buggy_file', help="filename of the moved source buggy file, in txt format.")
    parser.add_argument('--move_source_fixed_file', help="filename of the moved source fixed file, in txt format.")
    parser.add_argument('--correct_prediction_buggy_file',
                        help="filename of the correct prediction buggy file, in txt format.")
    parser.add_argument('--correct_prediction_fixed_file',
                        help="filename of the correct prediction fixed file, in txt format.")
    parser.add_argument('--incorrect_prediction_buggy_file',
                        help="filename of the incorrect prediction buggy file, in txt format.")
    parser.add_argument('--incorrect_prediction_fixed_file',
                        help="filename of the incorrect prediction fixed file, in txt format.")

    args = parser.parse_args()
    predictions = [x.strip() for x in open(args.predictions, 'r', encoding='utf-8').readlines()]
    buggy_file = [x.strip() for x in open(args.source_buggy_file, 'r', encoding='utf-8').readlines()]
    fixed_file = [x.strip() for x in open(args.source_fixed_file, 'r', encoding='utf-8').readlines()]
    correct_prediction_buggy_file = open(args.correct_prediction_buggy_file, 'w', encoding='utf-8')
    correct_prediction_fixed_file = open(args.correct_prediction_fixed_file, 'w', encoding='utf-8')
    incorrect_prediction_buggy_file = open(args.incorrect_prediction_buggy_file, 'w', encoding='utf-8')
    incorrect_prediction_fixed_file = open(args.incorrect_prediction_fixed_file, 'w', encoding='utf-8')

    move_source_buggy_file = open(args.move_source_buggy_file, 'w', encoding='utf-8')
    move_source_fixed_file = open(args.move_source_fixed_file, 'w', encoding='utf-8')

    assert len(predictions) == len(fixed_file) and len(fixed_file) == len(buggy_file)

    length = len(predictions)
    correct_count = 0
    incorrect_count = 0
    for i in range(length):
        p = predictions[i]
        b = buggy_file[i]
        f = fixed_file[i]

        move_source_buggy_file.write(b + '\n')
        move_source_fixed_file.write(f + '\n')

        if f == p:
            correct_count += 1
            correct_prediction_buggy_file.write(b + '\n')
            correct_prediction_fixed_file.write(f + '\n')
        else:
            incorrect_count += 1
            incorrect_prediction_buggy_file.write(b + '\n')
            incorrect_prediction_fixed_file.write(f + '\n')

    correct_prediction_buggy_file.close()
    correct_prediction_fixed_file.close()
    incorrect_prediction_buggy_file.close()
    incorrect_prediction_fixed_file.close()
    move_source_buggy_file.close()
    move_source_fixed_file.close()

    correct_acc = round(correct_count / length * 100, 2)
    incorrect_acc = round(incorrect_count / length * 100, 2)

    print('Total: ', length)
    print('correct_count: ', correct_count, ' percentage: ', correct_acc)
    print('incorrect_count: ', incorrect_count, ' percentage: ', incorrect_acc)


if __name__ == '__main__':
    main()
