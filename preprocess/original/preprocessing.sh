#!/usr/bin/env bash

CODE_DIR=$(realpath ../../);
DATA_DIR="${CODE_DIR}/data/original/";
SPM_DIR="${CODE_DIR}/models/original/pretrained";

echo $DATA_DIR
function spm_preprocess () {
  for MODEL in modit ; do #
     for DATA_SIZE in small medium ; do
       for DATA_SPLIT in test ; do
         if [ $DATA_SPLIT == 'test' ]; then
           MAX_LEN=9999
         else
           MAX_LEN=512
         fi
         python ${CODE_DIR}/preprocess/encode.py \
           --model-file ${SPM_DIR}/sentencepiece.bpe.model \
           --src_file ${DATA_DIR}/${MODEL}/${DATA_SIZE}/${DATA_SPLIT}.buggy-fixed.buggy \
           --tgt_file ${DATA_DIR}/${MODEL}/${DATA_SIZE}/${DATA_SPLIT}.buggy-fixed.fixed \
           --output_dir ${DATA_DIR}/${MODEL}/${DATA_SIZE}/ \
           --src_lang source --tgt_lang target \
           --pref $DATA_SPLIT --max_len $MAX_LEN \
           --workers 60;
       done
     done
  done
}

function binarize () {
    for MODEL in modit ; do #
       for DATA_SIZE in small medium ; do
         fairseq-preprocess \
            --source-lang source \
            --target-lang target \
            --testpref ${DATA_DIR}/${MODEL}/${DATA_SIZE}/test.spm \
            --destdir ${DATA_DIR}/${MODEL}/${DATA_SIZE}/data-bin \
            --thresholdtgt 0 \
            --thresholdsrc 0 \
            --workers 60 \
            --srcdict ${SPM_DIR}/dict.txt \
            --tgtdict ${SPM_DIR}/dict.txt;
       done
    done
}

spm_preprocess
binarize
