#!/usr/bin/env bash

CODE_DIR=$(realpath ../../)
export CUDA_VISIBLE_DEVICES=0
REFACTORING_TYPE=${1}
WHETHER_REFACTORING=${2}
DATA_SIZE=${3}

DATA_DIR="${CODE_DIR}/data/refactoring/${REFACTORING_TYPE}"
MODEL_DIR="${CODE_DIR}/models/original/graphcodebert"
OUTPUT_DIR="${CODE_DIR}/result/refactoring/graphcodebert/${REFACTORING_TYPE}/${WHETHER_REFACTORING}/${DATA_SIZE}"
mkdir -p ${OUTPUT_DIR}
EVALUATE_DIR="${CODE_DIR}/evaluate"

BEAM_SIZE=5
SOURCE_LENGTH=256
TARGET_LENGTH=256

TEST_FILE=${DATA_DIR}/${WHETHER_REFACTORING}/${DATA_SIZE}/test.buggy-fixed.buggy,${DATA_DIR}/${WHETHER_REFACTORING}/${DATA_SIZE}/test.buggy-fixed.fixed
TEST_MODEL=${MODEL_DIR}/${DATA_SIZE}/pytorch_model.bin
RESULT_FILE=${OUTPUT_DIR}/result.txt
MODEL_NAME=graphcodebert
pretrained_model="microsoft/graphcodebert-base";

function generate () {

    python ${CODE_DIR}/train/GraphCodeBERT/run.py \
        --do_test \
        --model_type roberta --model_name_or_path $pretrained_model --config_name $pretrained_model \
        --tokenizer_name $pretrained_model  --load_model_path $TEST_MODEL \
        --test_filename $TEST_FILE \
        --output_dir $OUTPUT_DIR \
        --max_source_length $SOURCE_LENGTH \
        --max_target_length $TARGET_LENGTH \
        --beam_size $BEAM_SIZE \
        --eval_batch_size 32 | tee ${RESULT_FILE};


  FILE_REFERENCE="${DATA_DIR}/${WHETHER_REFACTORING}/${DATA_SIZE}/test.buggy-fixed.fixed"
  FILE_PREDICTION="${OUTPUT_DIR}/test_0.output"

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
