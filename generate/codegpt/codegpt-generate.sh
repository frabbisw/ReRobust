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
RESULT_FILE=${OUTPUT_DIR}/result.txt
LANG=java
MODEL_NAME=codegpt

function generate() {

    python -u ${CODE_DIR}/train/CodeGPT/run.py \
            --do_test \
            --model_type gpt2 \
            --load_model_path $TEST_MODEL/pytorch_model.bin \
            --model_name_or_path microsoft/CodeGPT-small-java-adaptedGPT2 \
            --test_filename ${TEST_FILE}/test.buggy-fixed.buggy,${TEST_FILE}/test.buggy-fixed.fixed \
            --output_dir ${OUTPUT_DIR}/ \
            --max_source_length 256 \
            --max_target_length 256 \
            --beam_size 5 \
            --eval_batch_size 32 \
            2>&1 | tee ${OUTPUT_DIR}/train.log


  FILE_REFERENCE="${OUTPUT_DIR}/test_no_id.gold"
  FILE_PREDICTION="${OUTPUT_DIR}/test_no_id.output"

  cd ${CODE_DIR}
  echo "Evaluation" > ${RESULT_FILE}
  python -m evaluate.calculate_bleu_and_codebleu_to_excel --ref ${FILE_REFERENCE} --pre ${FILE_PREDICTION} --type_refactoring ${REFACTORING_TYPE} --dataset ${DATA_SIZE} --model ${MODEL_NAME} --whether_refactoring ${WHETHER_REFACTORING}


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
