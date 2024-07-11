#!/bin/bash

CODE_DIR=$(realpath ../);
ORIGINAL_DATA_DIR="${CODE_DIR}/data/humaneval_java/";
REFACTORING_DATA_DIR="${CODE_DIR}/data/humaneval_java/refactoring/";

function divide_data_to_files() {

  echo 'Starting divide data by different refactoring:'

  for REFACTORING_TYPE in local_variable_renaming method_renaming parameter_renaming ; do #  method_renaming parameter_renaming
     echo "==============================================================================="
     echo "apply ${REFACTORING_TYPE} on ${DATA_SIZE} dataset: "
     python refactoring_file_humaneval_java.py \
       --refactoring_type ${REFACTORING_TYPE} \
       --bug_file ${ORIGINAL_DATA_DIR}/buggy.jsonl \
       --fix_file ${ORIGINAL_DATA_DIR}/fixed.jsonl \
       --before_refactored_bug_file_path ${REFACTORING_DATA_DIR}/${REFACTORING_TYPE}/before_refactoring/buggy \
       --before_refactored_fix_file_path ${REFACTORING_DATA_DIR}/${REFACTORING_TYPE}/before_refactoring/fixed \
       --after_refactored_bug_file_path ${REFACTORING_DATA_DIR}/${REFACTORING_TYPE}/after_refactoring/buggy \
       --after_refactored_fix_file_path ${REFACTORING_DATA_DIR}/${REFACTORING_TYPE}/after_refactoring/fixed
  done
}

divide_data_to_files