import os
import openpyxl as opx
from .CodeBLEU import syntax_match, bleu, dataflow_match
from .bleu import _bleu

def calculate_and_write_excel():

    import argparse
    parser = argparse.ArgumentParser(description='Evaluate')
    parser.add_argument('--reference', '-ref', help="filename of the labels, in txt format.")
    parser.add_argument('--prediction', '-pre', help="filename of the leaderboard predictions, in txt format.")
    parser.add_argument('--type_refactoring', help="type_refactoring")
    parser.add_argument('--dataset', help="dataset")
    parser.add_argument('--model', help="model")
    parser.add_argument('--whether_refactoring', help="whether_refactoring")

    args = parser.parse_args()
    reference = args.reference
    prediction = args.prediction
    type_refactoring = args.type_refactoring
    dataset = args.dataset
    model = args.model
    whether_refactoring = args.whether_refactoring

    # reference = '/home/y_shi202/python-projects/APR-Refactoring/result/refactoring/modit/local_variable_renaming/before_refactoring/small/output.ref'
    # prediction = '/home/y_shi202/python-projects/APR-Refactoring/result/refactoring/modit/local_variable_renaming/before_refactoring/small/output.hyp'

    # reference = 'E:\\PythonProjects\\APR-Refactoring\\result\\refactoring\\lstm\\local_variable_renaming\\before_refactoring\\small\\output.ref'
    # prediction = 'E:\\PythonProjects\\APR-Refactoring\\result\\refactoring\\lstm\\local_variable_renaming\\before_refactoring\\small\\output.hyp'

    # titles = ['refactoring type', 'dataset', 'data_size', 'model',
    #           'Accuracy', 'BLEU', 'CodeBLEU',
    #           'ngram_match_score', 'weighted_ngram_match_score', 'syntax_match_score', 'dataflow_match_score']
    file_name = 'experiment result.xlsx'
    sheet_name = 'sheet1'
    workbook = opx.load_workbook(file_name)
    sheet = workbook.get_sheet_by_name(sheet_name)
    # sheet.append(titles)
    pre_title = [type_refactoring, dataset, model, whether_refactoring]
    result_ = pre_title + calculate_acc_bleu(reference, prediction) + calculate_code_bleu(reference, prediction, 'java')
    sheet.append(result_)
    workbook.save(file_name)
    workbook.close()


def calculate_acc_bleu(reference, prediction):
    bleu_score = round(_bleu(reference, prediction), 2)

    reference = [x.strip() for x in open(reference, 'r', encoding='utf-8').readlines()]
    prediction = [x.strip() for x in open(prediction, 'r', encoding='utf-8').readlines()]
    assert len(reference) == len(prediction)
    length = len(reference)
    count = 0
    for i in range(length):
        r = reference[i]
        p = prediction[i]
        if r == p:
            count += 1
    accuracy = round(count / length * 100, 2)
    print('Accuracy:', accuracy, ', BLEU:', bleu_score)
    return [accuracy, bleu_score]


def calculate_code_bleu(refs, hyp, lang):
    refs_ = [refs]
    alpha, beta, gamma, theta = [0.25, 0.25, 0.25, 0.25]

    # preprocess inputs
    pre_references = [[x.strip() for x in open(file, 'r', encoding='utf-8').readlines()] \
                      for file in refs_]
    hypothesis = [x.strip() for x in open(hyp, 'r', encoding='utf-8').readlines()]

    for i in range(len(pre_references)):
        assert len(hypothesis) == len(pre_references[i])

    references = []
    for i in range(len(hypothesis)):
        ref_for_instance = []
        for j in range(len(pre_references)):
            ref_for_instance.append(pre_references[j][i])
        references.append(ref_for_instance)
    assert len(references) == len(pre_references) * len(hypothesis)

    # calculate ngram match (BLEU)
    tokenized_hyps = [x.split() for x in hypothesis]
    tokenized_refs = [[x.split() for x in reference] for reference in references]

    ngram_match_score = bleu.corpus_bleu(tokenized_refs, tokenized_hyps)

    # calculate weighted ngram match
    path_ = os.path.dirname(os.path.abspath(__file__)) + os.sep + 'CodeBLEU' + os.sep + 'keywords' + os.sep + 'java.txt'
    keywords = [x.strip() for x in open(path_, 'r', encoding='utf-8').readlines()]

    def make_weights(reference_tokens, key_word_list):
        return {token: 1 if token in key_word_list else 0.2 \
                for token in reference_tokens}

    tokenized_refs_with_weights = [[[reference_tokens, make_weights(reference_tokens, keywords)] \
                                    for reference_tokens in reference] for reference in tokenized_refs]

    from evaluate.CodeBLEU import weighted_ngram_match
    weighted_ngram_match_score = weighted_ngram_match.corpus_bleu(tokenized_refs_with_weights, tokenized_hyps)

    # calculate syntax match
    syntax_match_score = syntax_match.corpus_syntax_match(references, hypothesis, lang)

    # calculate dataflow match
    dataflow_match_score = dataflow_match.corpus_dataflow_match(references, hypothesis, lang)

    code_bleu_score = alpha * ngram_match_score \
                      + beta * weighted_ngram_match_score \
                      + gamma * syntax_match_score \
                      + theta * dataflow_match_score

    code_bleu_score_ = round((code_bleu_score * 100.0), 2)
    ngram_match_score_ = round((code_bleu_score * 100.0), 2)
    weighted_ngram_match_score_ = round((weighted_ngram_match_score * 100.0), 2)
    syntax_match_score_ = round((syntax_match_score * 100.0), 2)
    dataflow_match_score_ = round((dataflow_match_score * 100.0), 2)

    print('CodeBLEU:', code_bleu_score_)

    print('ngram_match_score:', ngram_match_score_, ', weighted_ngram_match_score:', weighted_ngram_match_score_,
          ', syntax_match_score:', syntax_match_score_, ', dataflow_match_score:', dataflow_match_score_)

    return [code_bleu_score_, ngram_match_score_, weighted_ngram_match_score_, syntax_match_score_, dataflow_match_score_]


if __name__ == '__main__':
    calculate_and_write_excel()
