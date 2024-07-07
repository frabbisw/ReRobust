#!/usr/bin/env bash

CODE_DIR=$(realpath ../);
DATA_DIR="${CODE_DIR}/humaneval/data/refactoring";
SPM_DIR="${CODE_DIR}/models/original/pretrained";
PREPROCESS_OUTPUT="${CODE_DIR}/humaneval/preprocess/output";
[ ! -d ${PREPROCESS_OUTPUT} ] && mkdir -p ${PREPROCESS_OUTPUT}
PREPROCESS_RESULT="${PREPROCESS_OUTPUT}/preprocess_output_${RANDOM}";

echo 'Preprocess Information:' > ${PREPROCESS_RESULT}
echo $DATA_DIR

function spm_preprocess () {
  for REFACTORING_TYPE in original ; do #
    for STYLE in style1 style2 ; do
     for DATA_SPLIT in test ; do
       if [ $DATA_SPLIT == 'test' ]; then
         MAX_LEN=9999
       else
         MAX_LEN=512
       fi
       python encode.py \
         --model-file ${SPM_DIR}/sentencepiece.bpe.model \
         --src_file ${DATA_DIR}/${REFACTORING_TYPE}/${STYLE}/${DATA_SPLIT}.buggy-fixed.buggy \
         --tgt_file ${DATA_DIR}/${REFACTORING_TYPE}/${STYLE}/${DATA_SPLIT}.buggy-fixed.fixed \
         --output_dir ${DATA_DIR}/${REFACTORING_TYPE}/${STYLE}/ \
         --src_lang source \
         --tgt_lang target \
         --pref $DATA_SPLIT --max_len $MAX_LEN \
         --workers 60 >> ${PREPROCESS_RESULT}
     done
   done
  done
}

function binarize () {
  for REFACTORING_TYPE in original ; do #
    for STYLE in style1 style2 ; do
        fairseq-preprocess \
            --source-lang source \
            --target-lang target \
            --testpref ${DATA_DIR}/${REFACTORING_TYPE}/${STYLE}/test.spm \
            --destdir ${DATA_DIR}/${REFACTORING_TYPE}/${STYLE}/data-bin \
            --thresholdtgt 0 \
            --thresholdsrc 0 \
            --workers 60 \
            --srcdict ${SPM_DIR}/dict.txt \
            --tgtdict ${SPM_DIR}/dict.txt >> ${PREPROCESS_RESULT}
    done
  done
}

spm_preprocess
binarize
