#!/bin/bash\

current_dir=$(pwd);
base_path=$(realpath ../);

echo ${base_path}

GENERATE_PATH="${base_path}/dataset/";
cd ${GENERATE_PATH};

echo ${GENERATE_PATH}

function generate () {

  python get_substitutes1.py \
    --store_path ./generate-substitutes-medium.jsonl \
    --base_model=microsoft/graphcodebert-base \
    --eval_data_file=./test_sampled.txt \
    --block_size 512 \
    --index 373 400 &
}

generate;


#CUDA_VISIBLE_DEVICES=4 python get_substitutes.py \
#        --store_path ./test_subs_400_800.jsonl \
#        --base_model=microsoft/graphcodebert-base \
#        --eval_data_file=./test_sampled.txt \
#        --block_size 512 \
#        --index 778 800 &
#
#
#
#CUDA_VISIBLE_DEVICES=4 python get_substitutes.py \
#        --store_path ./test_subs_800_1200.jsonl \
#        --base_model=microsoft/graphcodebert-base \
#        --eval_data_file=./test_sampled.txt \
#        --block_size 512 \
#        --index 1155 1200 &
#
#
#
#CUDA_VISIBLE_DEVICES=5 python get_substitutes.py \
#        --store_path ./test_subs_1200_1600.jsonl \
#        --base_model=microsoft/graphcodebert-base \
#        --eval_data_file=./test_sampled.txt \
#        --block_size 512 \
#        --index 1554 1600 &
#
#
#
#CUDA_VISIBLE_DEVICES=5 python get_substitutes.py \
#        --store_path ./test_subs_1600_2000.jsonl \
#        --base_model=microsoft/graphcodebert-base \
#        --eval_data_file=./test_sampled.txt \
#        --block_size 512 \
#        --index 1851 2000 &
#
#
#
#CUDA_VISIBLE_DEVICES=6 python get_substitutes.py \
#        --store_path ./test_subs_2000_2400.jsonl \
#        --base_model=microsoft/graphcodebert-base \
#        --eval_data_file=./test_sampled.txt \
#        --block_size 512 \
#        --index 2255 2400 &
#
#
#
#CUDA_VISIBLE_DEVICES=6 python get_substitutes.py \
#        --store_path ./test_subs_2400_2800.jsonl \
#        --base_model=microsoft/graphcodebert-base \
#        --eval_data_file=./test_sampled.txt \
#        --block_size 512 \
#        --index 2675 2800 &
#
#
#
#CUDA_VISIBLE_DEVICES=6 python get_substitutes.py \
#        --store_path ./test_subs_3200_3600.jsonl \
#        --base_model=microsoft/graphcodebert-base \
#        --eval_data_file=./test_sampled.txt \
#        --block_size 512 \
#        --index 3546 3600 &
#
#
#
#CUDA_VISIBLE_DEVICES=1 python get_substitutes.py \
#        --store_path ./test_subs_3600_4000.jsonl \
#        --base_model=microsoft/graphcodebert-base \
#        --eval_data_file=./test_sampled.txt  \
#        --block_size 512 \
#        --index 3943 4000 &
