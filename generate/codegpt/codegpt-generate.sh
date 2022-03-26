#!/usr/bin/env bash

CODE_DIR=$(realpath ../../)
export CUDA_VISIBLE_DEVICES=0
REFACTORING_TYPE=${1}
WHETHER_REFACTORING=${2}
DATA_SIZE=${3}

DATA_DIR="${CODE_DIR}/data/refactoring/${REFACTORING_TYPE}"
MODEL_DIR="${CODE_DIR}/models/original/codegpt"
OUTPUT_DIR="${CODE_DIR}/result/refactoring/codegpt/${REFACTORING_TYPE}/${WHETHER_REFACTORING}/${DATA_SIZE}"
mkdir -p ${OUTPUT_DIR}
EVALUATE_DIR="${CODE_DIR}/evaluate"


TEST_FILE=${DATA_DIR}/${WHETHER_REFACTORING}/${DATA_SIZE}
TEST_MODEL=${MODEL_DIR}/${DATA_SIZE}
RESULT_FILE=${OUTPUT_DIR}/evaluation.log
LANG=java
MODEL_NAME=codegpt

function generate() {

    python -u ${CODE_DIR}/train/CodeGPT/run.py \
            --data_dir=${TEST_FILE} \
            --langs=$LANG \
            --output_dir=${OUTPUT_DIR} \
            --pretrain_dir=$TEST_MODEL \
            --log_file=$RESULT_FILE \
            --model_type=gpt2 \
            --block_size=512 \
            --do_infer \
            --logging_steps=100 \
            --seed=42

  FILE_REFERENCE="${DATA_DIR}/${WHETHER_REFACTORING}/${DATA_SIZE}/test.buggy-fixed.fixed"
  FILE_PREDICTION="${OUTPUT_DIR}/test.output"

  cd ${CODE_DIR}
  echo "Evaluation" > ${RESULT_FILE}
  python -m evaluate.calculate_bleu_and_codebleu_to_excel --ref ${FILE_REFERENCE} --pre ${FILE_PREDICTION} --type_refactoring ${REFACTORING_TYPE} --dataset ${DATA_SIZE} --model ${MODEL_NAME} --whether_refactoring ${WHETHER_REFACTORING} >> ${RESULT_FILE}


#  printf "CodeXGlue Evaluation: \t" >>${RESULT_FILE}
#  cd ${EVALUATE_DIR}
#  python evaluator.py --ref ${FILE_REFERENCE} --pre ${FILE_PREDICTION}
#  python evaluator.py --ref ${FILE_REFERENCE} --pre ${FILE_PREDICTION} >> ${RESULT_FILE}
#
#  cd CodeBLEU
#  echo "CodeBLEU Evaluation" > ${RESULT_FILE}
#  python calc_code_bleu.py --refs ${FILE_REFERENCE} --hyp ${FILE_PREDICTION} --lang java
#  python calc_code_bleu.py --refs ${FILE_REFERENCE} --hyp ${FILE_PREDICTION} --lang java >> ${RESULT_FILE}
}

generate
