#!/bin/bash

DATA_ROOT=/home/y_shi202/thesis-project/APR-Models-Performance/data/refactoring
touch calculating_CodeBLEU.txt

echo "#############################################################################################"
echo "calculating CodeBLEU for original code and transformed code";
echo "============================================================================================="

function calculating_CodeBLEU() {
  for DATA_SIZE in small medium; do
    for REFACTORING_TYPE in local_variable_renaming method_renaming parameter_renaming \
    boolean_exchange loop_exchange reorder_condition \
    convert_switch_to_if insert_log_statement insert_try_catch; do
      BEFORE_PATH=${DATA_ROOT}/${REFACTORING_TYPE}/before_refactoring/${DATA_SIZE}/test.buggy-fixed.buggy
      AFTER_PATH=${DATA_ROOT}/${REFACTORING_TYPE}/after_refactoring/${DATA_SIZE}/test.buggy-fixed.buggy
      echo "on ${DATA_SIZE} dataset, refactoring type is ${REFACTORING_TYPE}"
      echo "BEFORE_PATH is ${BEFORE_PATH}"
      echo "AFTER_PATH is ${AFTER_PATH}"
      python /home/y_shi202/related-project/MODIT/PLBART/CodeBLEU/calc_code_bleu.py --refs ${BEFORE_PATH} --hyp ${AFTER_PATH} --lang java
      echo "---------------------------------------------------------------------------------------------"
    done
  done
}

calculating_CodeBLEU >> calculating_CodeBLEU.txt