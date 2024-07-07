#!/usr/bin/env bash

CODE_DIR=$(realpath ../)
export CUDA_VISIBLE_DEVICES=0
REFACTORING_TYPE=${1}
WHETHER_REFACTORING=${2}

DATA_DIR="${CODE_DIR}/humaneval/data/refactoring/${REFACTORING_TYPE}"
MODEL_DIR="${CODE_DIR}/models/original/modit"
OUTPUT_DIR="${CODE_DIR}/humaneval/result/refactoring/modit/${REFACTORING_TYPE}/${WHETHER_REFACTORING}"
mkdir -p ${OUTPUT_DIR}
EVALUATE_DIR="${CODE_DIR}/evaluate"

DATA_BIN_PATH=${DATA_DIR}/${WHETHER_REFACTORING}/data-bin
RESULT_FILE=${OUTPUT_DIR}/result.txt
USER_DIR=${CODE_DIR}/src
TEST_MODEL=${MODEL_DIR}/medium/checkpoint_best.pt
FILE_PREF=${OUTPUT_DIR}/output

SOURCE=source
TARGET=target
LANGS="java,python,en_XX"
MODEL_NAME=modit


function generate() {

  fairseq-generate $DATA_BIN_PATH \
    --fp16 \
    --user-dir $USER_DIR \
    --path $TEST_MODEL \
    --truncate-source \
    --task translation_in_same_language \
    --gen-subset test \
    -t $TARGET -s $SOURCE \
    --scoring sacrebleu --remove-bpe 'sentencepiece' \
    --max-len-b 500 --beam 5 \
    --batch-size 32 --langs $LANGS >$FILE_PREF

  cat $FILE_PREF | grep -P "^H" | sort -V | cut -f 3- | sed 's/\[${TARGET}\]//g' >$FILE_PREF.hyp
  ORIGINAL_TGT="${DATA_DIR}/${WHETHER_REFACTORING}/test.buggy-fixed.fixed"
  less ${ORIGINAL_TGT} >$FILE_PREF.ref


  cd ${CODE_DIR}
  echo "Evaluation" > ${RESULT_FILE}
  python -m evaluate.calculate_bleu_and_codebleu_to_excel --ref ${FILE_PREF}.ref --pre ${FILE_PREF}.hyp --type_refactoring ${REFACTORING_TYPE} --dataset "default" --model ${MODEL_NAME} --whether_refactoring ${WHETHER_REFACTORING}

#  printf "CodeXGlue Evaluation: \t" >>${RESULT_FILE}
#  cd ${EVALUATE_DIR}
#  python evaluator.py --ref ${FILE_PREF}.ref --pre ${FILE_PREF}.hyp
#  python evaluator.py --ref ${FILE_PREF}.ref --pre ${FILE_PREF}.hyp >>${RESULT_FILE}
#
#  cd CodeBLEU
#  echo "CodeBLEU Evaluation" > ${RESULT_FILE}
#  python calc_code_bleu.py --refs $FILE_PREF.ref --hyp $FILE_PREF.hyp --lang java >> ${RESULT_FILE}
#  python calc_code_bleu.py --refs $FILE_PREF.ref --hyp $FILE_PREF.hyp --lang java
}

generate
