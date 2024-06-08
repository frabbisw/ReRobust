#!/usr/bin/env bash

CODE_DIR=$(realpath ../);
DATA_DIR="${CODE_DIR}/data/abstract/";
SPM_DIR="${CODE_DIR}/models/original/pretrained";

echo $DATA_DIR

function spm_preprocess () {
    for DATA_SIZE in small medium ; do
     for DATA_SPLIT in train eval test; do
       if [ $DATA_SPLIT == 'test' ]; then
         MAX_LEN=9999
       else
         MAX_LEN=512
       fi
       python encode.py \
         --model-file ${SPM_DIR}/sentencepiece.bpe.model \
         --src_file ${DATA_DIR}/${DATA_SIZE}/${DATA_SPLIT}.buggy-fixed.buggy \
         --tgt_file ${DATA_DIR}/${DATA_SIZE}/${DATA_SPLIT}.buggy-fixed.fixed \
         --output_dir ${DATA_DIR}/${DATA_SIZE}/ \
         --src_lang source --tgt_lang target \
         --pref $DATA_SPLIT --max_len $MAX_LEN \
         --workers 60
     done
    done
}

function binarize () {
  for DATA_SIZE in small medium ; do
      fairseq-preprocess \
          --source-lang source \
          --target-lang target \
          --trainpref ${DATA_DIR}/${DATA_SIZE}/train.spm \
          --validpref ${DATA_DIR}/${DATA_SIZE}/eval.spm \
          --testpref ${DATA_DIR}/${DATA_SIZE}/test.spm \
          --destdir ${DATA_DIR}/${DATA_SIZE}/data-bin \
          --thresholdtgt 0 \
          --thresholdsrc 0 \
          --workers 60 \
          --srcdict ${SPM_DIR}/dict.txt \
          --tgtdict ${SPM_DIR}/dict.txt
  done
}

spm_preprocess
binarize
