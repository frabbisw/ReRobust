#!/usr/bin/env bash

CODE_DIR=$(realpath ../)
RESULT_PATH="${CODE_DIR}/result/analysis"
DATA_DIR_REFACTORING_PREDICTION="${CODE_DIR}/result/refactoring"
DATA_DIR_REFACTORING="${CODE_DIR}/data/refactoring"
DIVIDE_RESULT_PATH="${RESULT_PATH}/divide_output"

echo 'divide data by prediction: ' > ${DIVIDE_RESULT_PATH}

function divide_data() {
   for REFACTORING_TYPE in local_variable_renaming ; do # local_variable_renaming method_renaming parameter_renaming
    for DATA_SIZE in small ; do # small medium
      for MODELS in lstm ; do # modit codebert codegpt lstm transformer

      prediction_file_before_refactoring=${DATA_DIR_REFACTORING_PREDICTION}/${MODELS}/${REFACTORING_TYPE}/before_refactoring/${DATA_SIZE}/output.hyp
      prediction_file_after_refactoring=${DATA_DIR_REFACTORING_PREDICTION}/${MODELS}/${REFACTORING_TYPE}/after_refactoring/${DATA_SIZE}/output.hyp
      if [ "$MODELS" == codebert ]; then
        prediction_file_before_refactoring=${DATA_DIR_REFACTORING_PREDICTION}/${MODELS}/${REFACTORING_TYPE}/before_refactoring/${DATA_SIZE}/test_0.output
        prediction_file_after_refactoring=${DATA_DIR_REFACTORING_PREDICTION}/${MODELS}/${REFACTORING_TYPE}/after_refactoring/${DATA_SIZE}/test_0.output
      fi
      if [ "$MODELS" == codegpt ]; then
        prediction_file_before_refactoring=${DATA_DIR_REFACTORING_PREDICTION}/${MODELS}/${REFACTORING_TYPE}/before_refactoring/${DATA_SIZE}/test.output
        prediction_file_after_refactoring=${DATA_DIR_REFACTORING_PREDICTION}/${MODELS}/${REFACTORING_TYPE}/after_refactoring/${DATA_SIZE}/test.output
      fi


      source_buggy_file_before_refactoring=${DATA_DIR_REFACTORING}/${REFACTORING_TYPE}/before_refactoring/${DATA_SIZE}/test.buggy-fixed.buggy
      source_buggy_file_after_refactoring=${DATA_DIR_REFACTORING}/${REFACTORING_TYPE}/after_refactoring/${DATA_SIZE}/test.buggy-fixed.buggy
      source_fixed_file_before_refactoring=${DATA_DIR_REFACTORING}/${REFACTORING_TYPE}/before_refactoring/${DATA_SIZE}/test.buggy-fixed.fixed
      source_fixed_file_after_refactoring=${DATA_DIR_REFACTORING}/${REFACTORING_TYPE}/after_refactoring/${DATA_SIZE}/test.buggy-fixed.fixed

      cases_before_correct_after_incorrect=${RESULT_PATH}/cases_before_correct_after_incorrect/${MODELS}/${REFACTORING_TYPE}/${DATA_SIZE}
      cases_before_incorrect_after_correct=${RESULT_PATH}/cases_before_incorrect_after_correct/${MODELS}/${REFACTORING_TYPE}/${DATA_SIZE}
      cases_before_correct_after_correct=${RESULT_PATH}/cases_before_correct_after_correct/${MODELS}/${REFACTORING_TYPE}/${DATA_SIZE}
      cases_before_incorrect_after_incorrect=${RESULT_PATH}/cases_before_incorrect_after_incorrect/${MODELS}/${REFACTORING_TYPE}/${DATA_SIZE}

      [ ! -d ${cases_before_correct_after_incorrect} ] && mkdir -p ${cases_before_correct_after_incorrect}
      [ ! -d ${cases_before_incorrect_after_correct} ] && mkdir -p ${cases_before_incorrect_after_correct}
      [ ! -d ${cases_before_correct_after_correct} ] && mkdir -p ${cases_before_correct_after_correct}
      [ ! -d ${cases_before_incorrect_after_incorrect} ] && mkdir -p ${cases_before_incorrect_after_incorrect}

      echo "refactoring type is ${REFACTORING_TYPE}, on ${DATA_SIZE} dataset, on model ${MODELS}:"  >> ${DIVIDE_RESULT_PATH}

      python case_analysis.py \
        --prediction_file_before_refactoring ${prediction_file_before_refactoring} \
        --prediction_file_after_refactoring ${prediction_file_after_refactoring} \
        --source_buggy_file_before_refactoring ${source_buggy_file_before_refactoring} \
        --source_buggy_file_after_refactorin ${source_buggy_file_after_refactoring} \
        --source_fixed_file_before_refactoring ${source_fixed_file_before_refactoring} \
        --source_fixed_file_after_refactorin ${source_fixed_file_after_refactoring} \
        --cases_before_correct_after_incorrect ${cases_before_correct_after_incorrect}/cases_before_correct_after_incorrect.txt \
        --cases_before_incorrect_after_correct ${cases_before_incorrect_after_correct}/cases_before_incorrect_after_correct.txt \
        --cases_before_correct_after_correct ${cases_before_correct_after_correct}/cases_before_correct_after_correct.txt \
        --cases_before_incorrect_after_incorrect ${cases_before_incorrect_after_incorrect}/cases_before_incorrect_after_incorrect.txt >> ${DIVIDE_RESULT_PATH}
      echo "---------------------------------------------------------------------------------------------" >> ${DIVIDE_RESULT_PATH}
      done
    done
  done
}

divide_data