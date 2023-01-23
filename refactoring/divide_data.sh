#!/bin/bash

CODE_DIR=$(realpath ../);
ORIGINAL_DATA_DIR="${CODE_DIR}/data/concreteBFPs/";
REFACTORING_DATA_DIR="${CODE_DIR}/data/refactoring/";

function divide_data_to_files() {

  echo 'Starting divide data by different refactoring:'

  for REFACTORING_TYPE in local_variable_renaming method_renaming parameter_renaming ; do #  method_renaming parameter_renaming
    for DATA_SIZE in small medium; do #
      for DATA_SPLIT in test ; do
         echo "==============================================================================="
         echo "apply ${REFACTORING_TYPE} on ${DATA_SIZE} dataset: "
         python refactoring_file.py \
           --refactoring_type ${REFACTORING_TYPE} \
           --bug_file ${ORIGINAL_DATA_DIR}/${DATA_SIZE}/${DATA_SPLIT}.buggy-fixed.buggy \
           --fix_file ${ORIGINAL_DATA_DIR}/${DATA_SIZE}/${DATA_SPLIT}.buggy-fixed.fixed \
           --before_refactored_bug_file_path ${REFACTORING_DATA_DIR}/${REFACTORING_TYPE}/before_refactoring/${DATA_SIZE}/${DATA_SPLIT}.buggy-fixed.buggy \
           --before_refactored_fix_file_path ${REFACTORING_DATA_DIR}/${REFACTORING_TYPE}/before_refactoring/${DATA_SIZE}/${DATA_SPLIT}.buggy-fixed.fixed \
           --after_refactored_bug_file_path ${REFACTORING_DATA_DIR}/${REFACTORING_TYPE}/after_refactoring/${DATA_SIZE}/${DATA_SPLIT}.buggy-fixed.buggy \
           --after_refactored_fix_file_path ${REFACTORING_DATA_DIR}/${REFACTORING_TYPE}/after_refactoring/${DATA_SIZE}/${DATA_SPLIT}.buggy-fixed.fixed
      done
    done
  done
}

divide_data_to_files