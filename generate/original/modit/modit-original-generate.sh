#!/usr/bin/env bash

CODE_DIR=$(realpath ../../../)
export CUDA_VISIBLE_DEVICES=0
DATA_SIZE=${1}

DATA_DIR="${CODE_DIR}/data/original/modit"
MODEL_DIR="${CODE_DIR}/models/original/modit"
OUTPUT_DIR="${CODE_DIR}/result/original/modit"
EVALUATE_DIR="${CODE_DIR}/evaluate"
langs="java,python,en_XX"

SOURCE=source
TARGET=target

DATA_BIN_PATH=${DATA_DIR}/${DATA_SIZE}/data-bin
RESULT_PATH=${OUTPUT_DIR}/${DATA_SIZE}

USER_DIR=${CODE_DIR}/src


function generate() {
  model=${MODEL_DIR}/${DATA_SIZE}/checkpoint_best.pt
  FILE_PREF=${RESULT_PATH}/output
  RESULT_FILE=${RESULT_PATH}/result.txt

  fairseq-generate $DATA_BIN_PATH \
    --user-dir $USER_DIR \
    --path $model \
    --truncate-source \
    --task translation_in_same_language \
    --gen-subset test \
    -t $TARGET -s $SOURCE \
    --scoring sacrebleu --remove-bpe 'sentencepiece' \
    --max-len-b 500 --beam 5 \
    --batch-size 32 --langs $langs >$FILE_PREF


  cat $FILE_PREF | grep -P "^H" | sort -V | cut -f 3- | sed 's/\[${TARGET}\]//g' >$FILE_PREF.hyp
  ORIGINAL_TGT="${DATA_DIR}/${DATA_SIZE}/test.buggy-fixed.fixed"
  less ${ORIGINAL_TGT} >$FILE_PREF.ref

  printf "CodeXGlue Evaluation: \t" >>${RESULT_FILE}
  cd ${EVALUATE_DIR};
  python evaluator.py --ref ${FILE_PREF}.ref --pre ${FILE_PREF}.hyp
  python evaluator.py --ref ${FILE_PREF}.ref --pre ${FILE_PREF}.hyp >>${RESULT_FILE}

  cd CodeBLEU;
  echo "CodeBLEU Evaluation" > ${RESULT_FILE}
  python calc_code_bleu.py --refs $FILE_PREF.ref --hyp $FILE_PREF.hyp --lang java >> ${RESULT_FILE}
  python calc_code_bleu.py --refs $FILE_PREF.ref --hyp $FILE_PREF.hyp --lang java
}

generate
