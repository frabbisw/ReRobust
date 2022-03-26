#!/usr/bin/env bash

CODE_DIR=$(realpath ../../)
echo ${CODE_DIR}

echo "#############################################################################################"
echo "Experiment for all models, all refactorings, all datasets";
echo "============================================================================================="

function generate_on_different_dataset_by_different_refactoring_on_different_models() {
  for REFACTORING_TYPE in local_variable_renaming method_renaming parameter_renaming ; do #
    for DATA_SIZE in small medium ; do
      for MODELS in modit codebert codegpt lstm transformer ; do #follow this order
        for WHETHER_REFACTORING in before_refactoring after_refactoring ; do
          echo "on model ${MODELS}, on ${DATA_SIZE} dataset, ${WHETHER_REFACTORING}, refactoring type is ${REFACTORING_TYPE}:"
          bash ${CODE_DIR}/generate/${MODELS}/${MODELS}-generate.sh ${REFACTORING_TYPE} ${WHETHER_REFACTORING} ${DATA_SIZE}
          echo "---------------------------------------------------------------------------------------------"
        done
      done
    done
    echo "============================================================================================="
  done

}

generate_on_different_dataset_by_different_refactoring_on_different_models
