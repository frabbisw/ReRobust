# from bleu import _bleu
from ToolExcel import ToolExcel
if __name__ == '__main__':
    # reference = "E:/PythonProjects/APR-Refactoring/result/original/modit/small/output.ref"
    # prediction = "E:/PythonProjects/APR-Refactoring/result/original/modit/small/output.hyp"
    # bleu_score = round(_bleu(reference, prediction), 2)
    # print(bleu_score)
    #
    # print('CodeBLEU score: %.2f' % (0.52653213123 * 100.0))

    ToolExcel.workbook_new()
    ToolExcel.workbook_new()
    titles = [['refactoring type', 'dataset', 'data_size', 'model',
               'Accuracy', 'BLEU', 'CodeBLEU',
               'ngram_match_score', 'weighted_ngram_match_score', 'syntax_match_score', 'dataflow_match_score']]
    ToolExcel.workbook_append(titles)
    data = ToolExcel.workbook_read()
    print(data)
