#!/usr/bin/env bash

CODE_DIR=$(realpath ../);
RESULT_PATH="${CODE_DIR}/result/original"
DATA_DIR="${CODE_DIR}/data/original/";
DATA_DIR_REFACTORING="${CODE_DIR}/data/refactoring/";
DIVIDE_RESULT_PATH="${CODE_DIR}/preprocess/divide_output"

echo 'divide data by prediction: ' > ${DIVIDE_RESULT_PATH}

function divide_data() {

  for MODEL in modit ; do
    for DATA_SIZE in small medium ; do
      python divide_data_by_prediction.py \
        --predictions ${RESULT_PATH}/${MODEL}/${DATA_SIZE}/output.hyp \
        --source_buggy_file ${DATA_DIR}/${MODEL}/${DATA_SIZE}/test.buggy-fixed.buggy \
        --source_fixed_file ${DATA_DIR}/${MODEL}/${DATA_SIZE}/test.buggy-fixed.fixed \
        --move_source_buggy_file ${DATA_DIR_REFACTORING}/${MODEL}/test_both/before_refactoring/${DATA_SIZE}/test.buggy-fixed.buggy \
        --move_source_fixed_file ${DATA_DIR_REFACTORING}/${MODEL}/test_both/before_refactoring/${DATA_SIZE}/test.buggy-fixed.fixed \
        --correct_prediction_buggy_file ${DATA_DIR_REFACTORING}/${MODEL}/test_prediction_correct/before_refactoring/${DATA_SIZE}/test.buggy-fixed.buggy \
        --correct_prediction_fixed_file ${DATA_DIR_REFACTORING}/${MODEL}/test_prediction_correct/before_refactoring/${DATA_SIZE}/test.buggy-fixed.fixed \
        --incorrect_prediction_buggy_file ${DATA_DIR_REFACTORING}/${MODEL}/test_prediction_incorrect/before_refactoring/${DATA_SIZE}/test.buggy-fixed.buggy \
        --incorrect_prediction_fixed_file ${DATA_DIR_REFACTORING}/${MODEL}/test_prediction_incorrect/before_refactoring/${DATA_SIZE}/test.buggy-fixed.fixed >> ${DIVIDE_RESULT_PATH}
    done
  done
}

divide_data