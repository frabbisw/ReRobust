#!/bin/bash\

current_dir=$(pwd);
base_path=$(realpath ../);

echo ${base_path}

GENERATE_PATH="${base_path}/dataset/";
cd ${GENERATE_PATH};

echo ${GENERATE_PATH}

function generate () {

  python get_substitutes.py \
    --store_path ./generate-substitutes.jsonl \
    --base_model=microsoft/graphcodebert-base \
    --eval_data_file=./test_sampled.txt \
    --block_size 512 \
    --index 373 400 &
}

generate;