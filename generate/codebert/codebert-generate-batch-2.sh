#!/bin/bash

echo "#############################################################################################"
echo "Experiment for codebert-refactoring";
echo "============================================================================================="

function generate_on_different_dataset_by_different_refactoring() {
  for REFACTORING_TYPE in boolean_exchange convert_switch_to_if insert_log_statement; do
    for DATA_SIZE in small medium; do
      for WHETHER_REFACTORING in before_refactoring after_refactoring; do
        echo "on ${DATA_SIZE} dataset, ${WHETHER_REFACTORING}, refactoring type is ${REFACTORING_TYPE}:"
        bash codebert-generate.sh ${REFACTORING_TYPE} ${WHETHER_REFACTORING} ${DATA_SIZE}
        echo "---------------------------------------------------------------------------------------------"
      done
    done
  done
}

generate_on_different_dataset_by_different_refactoring