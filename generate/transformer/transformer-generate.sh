#!/usr/bin/env bash

CODE_DIR=$(realpath ../../)
export CUDA_VISIBLE_DEVICES=0
REFACTORING_TYPE=${1}
WHETHER_REFACTORING=${2}
DATA_SIZE=${3}

DATA_DIR="${CODE_DIR}/data/refactoring"
MODEL_DIR="${CODE_DIR}/models/original/transformer"
OUTPUT_DIR="${CODE_DIR}/result/refactoring/transformer/${REFACTORING_TYPE}/${WHETHER_REFACTORING}/${DATA_SIZE}"
mkdir -p ${OUTPUT_DIR};
EVALUATE_DIR="${CODE_DIR}/evaluate"

SOURCE=source;
TARGET=target;
DATA_BIN_PATH=${DATA_DIR}/${REFACTORING_TYPE}/${WHETHER_REFACTORING}/${DATA_SIZE}/data-bin
USER_DIR=${CODE_DIR}/src
langs="java,python,en_XX"
MODEL_NAME=transformer

function generate () {
    MODEL=${MODEL_DIR}/${DATA_SIZE}/checkpoint_best.pt
    FILE_PREF=${OUTPUT_DIR}/output
    RESULT_FILE=${OUTPUT_DIR}/result.txt

    fairseq-generate $DATA_BIN_PATH \
        --fp16 \
        --user-dir $USER_DIR \
        --path $MODEL \
        --truncate-source \
        --task translation_in_same_language \
        --gen-subset test \
        -t $TARGET -s $SOURCE \
        --scoring sacrebleu --remove-bpe 'sentencepiece' \
        --max-len-b 500 --beam 5 \
        --batch-size 8 --langs $langs > $FILE_PREF

    cat $FILE_PREF | grep -P "^H" |sort -V |cut -f 3- | sed 's/\[${TARGET}\]//g' > $FILE_PREF.hyp
    cat $FILE_PREF | grep -P "^T" |sort -V |cut -f 2- | sed 's/\[${TARGET}\]//g' > $FILE_PREF.ref
    sacrebleu -tok 'none' -s 'none' $FILE_PREF.ref < $FILE_PREF.hyp 2>&1 | tee ${RESULT_FILE}

    cd ${CODE_DIR}
    echo "Evaluation" > ${RESULT_FILE}
    python -m evaluate.calculate_bleu_and_codebleu_to_excel --ref ${FILE_PREF}.ref --pre ${FILE_PREF}.hyp --type_refactoring ${REFACTORING_TYPE} --dataset ${DATA_SIZE} --model ${MODEL_NAME} --whether_refactoring ${WHETHER_REFACTORING} >> ${RESULT_FILE}


#    printf "CodeXGlue Evaluation: \t" >> ${RESULT_FILE}
#    cd ${EVALUATE_DIR}
#    python evaluator.py --ref ${FILE_PREF}.ref --pre ${FILE_PREF}.hyp
#    python evaluator.py --ref ${FILE_PREF}.ref --pre ${FILE_PREF}.hyp >> ${RESULT_FILE}
#
#    cd CodeBLEU;
#    echo "CodeBLEU Evaluation" > ${RESULT_FILE}
#    python calc_code_bleu.py --refs $FILE_PREF.ref --hyp $FILE_PREF.hyp --lang java >> ${RESULT_FILE}
#    python calc_code_bleu.py --refs $FILE_PREF.ref --hyp $FILE_PREF.hyp --lang java
}

generate
