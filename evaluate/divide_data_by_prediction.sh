#!/usr/bin/env bash

CODE_DIR=$(realpath ../)
RESULT_PATH="${CODE_DIR}/result/evaluate"
DATA_DIR_REFACTORING_PREDICTION="${CODE_DIR}/result/refactoring"
DATA_DIR_REFACTORING="${CODE_DIR}/data/refactoring"
DIVIDE_RESULT_PATH="${RESULT_PATH}/divide_output"

echo 'divide data by prediction: ' > ${DIVIDE_RESULT_PATH}

function divide_data() {
   for REFACTORING_TYPE in local_variable_renaming  ; do # method_renaming parameter_renaming
    for DATA_SIZE in small  ; do # medium
      for MODELS in modit ; do # codebert codegpt lstm transformer
        declare -a result
        index=0
        for WHETHER_REFACTORING in before_refactoring after_refactoring ; do
          correct_prediction_buggy_file_path=${RESULT_PATH}/test_prediction_correct/${MODEL}/${REFACTORING_TYPE}/${WHETHER_REFACTORING}/${DATA_SIZE}
          incorrect_prediction_buggy_file_path=${RESULT_PATH}/test_prediction_incorrect/${MODEL}/${REFACTORING_TYPE}/${WHETHER_REFACTORING}/${DATA_SIZE}
          [ ! -d ${correct_prediction_buggy_file_path} ] && mkdir -p ${correct_prediction_buggy_file_path}
          [ ! -d ${incorrect_prediction_buggy_file_path} ] && mkdir -p ${incorrect_prediction_buggy_file_path}
          echo "on model ${MODELS}, on ${DATA_SIZE} dataset, ${WHETHER_REFACTORING}, refactoring type is ${REFACTORING_TYPE}:"  >> ${DIVIDE_RESULT_PATH}
          python divide_data_by_prediction.py \
            --prediction_file ${DATA_DIR_REFACTORING_PREDICTION}/${MODELS}/${REFACTORING_TYPE}/${WHETHER_REFACTORING}/${DATA_SIZE}/output.hyp \
            --source_buggy_file ${DATA_DIR_REFACTORING}/${REFACTORING_TYPE}/${WHETHER_REFACTORING}/${DATA_SIZE}/test.buggy-fixed.buggy \
            --source_fixed_file ${DATA_DIR_REFACTORING}/${REFACTORING_TYPE}/${WHETHER_REFACTORING}/${DATA_SIZE}/test.buggy-fixed.fixed \
            --correct_prediction_buggy_file ${correct_prediction_buggy_file_path}/test.buggy-fixed.buggy \
            --correct_prediction_fixed_file ${correct_prediction_buggy_file_path}/test.buggy-fixed.fixed \
            --incorrect_prediction_buggy_file ${incorrect_prediction_buggy_file_path}/test.buggy-fixed.buggy \
            --incorrect_prediction_fixed_file ${incorrect_prediction_buggy_file_path}/test.buggy-fixed.fixed >> ${DIVIDE_RESULT_PATH}
          echo "---------------------------------------------------------------------------------------------" >> ${DIVIDE_RESULT_PATH}
          result[$index]=$(python divide_data_by_prediction.py \
            --prediction_file ${DATA_DIR_REFACTORING_PREDICTION}/${MODELS}/${REFACTORING_TYPE}/${WHETHER_REFACTORING}/${DATA_SIZE}/output.hyp \
            --source_buggy_file ${DATA_DIR_REFACTORING}/${REFACTORING_TYPE}/${WHETHER_REFACTORING}/${DATA_SIZE}/test.buggy-fixed.buggy \
            --source_fixed_file ${DATA_DIR_REFACTORING}/${REFACTORING_TYPE}/${WHETHER_REFACTORING}/${DATA_SIZE}/test.buggy-fixed.fixed \
            --correct_prediction_buggy_file ${correct_prediction_buggy_file_path}/test.buggy-fixed.buggy \
            --correct_prediction_fixed_file ${correct_prediction_buggy_file_path}/test.buggy-fixed.fixed \
            --incorrect_prediction_buggy_file ${incorrect_prediction_buggy_file_path}/test.buggy-fixed.buggy \
            --incorrect_prediction_fixed_file ${incorrect_prediction_buggy_file_path}/test.buggy-fixed.fixed  2>&1 > /dev/null)
#          echo "**${result[$index]}=="
          index=$index+1
        done
        python
#        echo "**${result[*]}=="
      done
    done
  done
}

divide_data