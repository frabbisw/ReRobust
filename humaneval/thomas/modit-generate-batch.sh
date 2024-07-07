#!/bin/bash

echo "#############################################################################################"
echo "Experiment for modit-refactoring";
echo "============================================================================================="

function generate_on_different_dataset_by_different_refactoring() {
  for REFACTORING_TYPE in local_variable_renaming method_renaming parameter_renaming \
  boolean_exchange convert_switch_to_if insert_log_statement \
  insert_try_catch loop_exchange reorder_condition ; do # method_renaming parameter_renaming
    for WHETHER_REFACTORING in before_refactoring after_refactoring ; do
      echo "on humaneval dataset, ${WHETHER_REFACTORING}, refactoring type is ${REFACTORING_TYPE}:"
      bash modit-generate.sh ${REFACTORING_TYPE} ${WHETHER_REFACTORING}
      echo "---------------------------------------------------------------------------------------------"
    done
  done
}

generate_on_different_dataset_by_different_refactoring