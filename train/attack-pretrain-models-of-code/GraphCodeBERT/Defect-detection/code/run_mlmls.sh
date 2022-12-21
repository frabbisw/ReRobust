CUDA_VISIBLE_DEVICES=0 python mhm_attack.py \
    --output_dir=./saved_models \
    --model_type=roberta \
    --tokenizer_name=microsoft/graphcodebert-base \
    --model_name_or_path=microsoft/graphcodebert-base \
    --csv_store_path ./attack_mhm_0_400.csv \
    --base_model=microsoft/graphcodebert-base \
    --train_data_file=../preprocess/dataset/train.jsonl \
    --eval_data_file=../preprocess/dataset/test_subs_0_400.jsonl \
    --test_data_file=../preprocess/dataset/test.jsonl \
    --code_length 512 \
    --data_flow_length 128 \
    --eval_batch_size 16 \
    --seed 123456  2>&1 | tee attack_mhm_0_400.log &

CUDA_VISIBLE_DEVICES=0 python mhm_attack.py \
    --output_dir=./saved_models \
    --model_type=roberta \
    --tokenizer_name=microsoft/graphcodebert-base \
    --model_name_or_path=microsoft/graphcodebert-base \
    --csv_store_path ./attack_mhm_400_800.csv \
    --base_model=microsoft/graphcodebert-base \
    --train_data_file=../preprocess/dataset/train.jsonl \
    --eval_data_file=../preprocess/dataset/test_subs_400_800.jsonl \
    --test_data_file=../preprocess/dataset/test.jsonl \
    --code_length 512 \
    --data_flow_length 128 \
    --eval_batch_size 16 \
    --seed 123456  2>&1 | tee attack_mhm_400_800.log &

CUDA_VISIBLE_DEVICES=1 python mhm_attack.py \
    --output_dir=./saved_models \
    --model_type=roberta \
    --tokenizer_name=microsoft/graphcodebert-base \
    --model_name_or_path=microsoft/graphcodebert-base \
    --csv_store_path ./attack_mhm_800_1200.csv \
    --base_model=microsoft/graphcodebert-base \
    --train_data_file=../preprocess/dataset/train.jsonl \
    --eval_data_file=../preprocess/dataset/test_subs_800_1200.jsonl \
    --test_data_file=../preprocess/dataset/test.jsonl \
    --code_length 512 \
    --data_flow_length 128 \
    --eval_batch_size 16 \
    --seed 123456  2>&1 | tee attack_mhm_800_1200.log &

CUDA_VISIBLE_DEVICES=2 python mhm_attack.py \
    --output_dir=./saved_models \
    --model_type=roberta \
    --tokenizer_name=microsoft/graphcodebert-base \
    --model_name_or_path=microsoft/graphcodebert-base \
    --csv_store_path ./attack_mhm_1200_1600.csv \
    --base_model=microsoft/graphcodebert-base \
    --train_data_file=../preprocess/dataset/train.jsonl \
    --eval_data_file=../preprocess/dataset/test_subs_1200_1600.jsonl \
    --test_data_file=../preprocess/dataset/test.jsonl \
    --code_length 512 \
    --data_flow_length 128 \
    --eval_batch_size 16 \
    --seed 123456  2>&1 | tee attack_mhm_1200_1600.log &

CUDA_VISIBLE_DEVICES=2 python mhm_attack.py \
    --output_dir=./saved_models \
    --model_type=roberta \
    --tokenizer_name=microsoft/graphcodebert-base \
    --model_name_or_path=microsoft/graphcodebert-base \
    --csv_store_path ./attack_mhm_1600_2000.csv \
    --base_model=microsoft/graphcodebert-base \
    --train_data_file=../preprocess/dataset/train.jsonl \
    --eval_data_file=../preprocess/dataset/test_subs_1600_2000.jsonl \
    --test_data_file=../preprocess/dataset/test.jsonl \
    --code_length 512 \
    --data_flow_length 128 \
    --eval_batch_size 16 \
    --seed 123456  2>&1 | tee attack_mhm_1600_2000.log &

CUDA_VISIBLE_DEVICES=3 python mhm_attack.py \
    --output_dir=./saved_models \
    --model_type=roberta \
    --tokenizer_name=microsoft/graphcodebert-base \
    --model_name_or_path=microsoft/graphcodebert-base \
    --csv_store_path ./attack_mhm_2000_2400.csv \
    --base_model=microsoft/graphcodebert-base \
    --train_data_file=../preprocess/dataset/train.jsonl \
    --eval_data_file=../preprocess/dataset/test_subs_2000_2400.jsonl \
    --test_data_file=../preprocess/dataset/test.jsonl \
    --code_length 512 \
    --data_flow_length 128 \
    --eval_batch_size 16 \
    --seed 123456  2>&1 | tee attack_mhm_2000_2400.log &

CUDA_VISIBLE_DEVICES=3 python mhm_attack.py \
    --output_dir=./saved_models \
    --model_type=roberta \
    --tokenizer_name=microsoft/graphcodebert-base \
    --model_name_or_path=microsoft/graphcodebert-base \
    --csv_store_path ./attack_mhm_2400_2800.csv \
    --base_model=microsoft/graphcodebert-base \
    --train_data_file=../preprocess/dataset/train.jsonl \
    --eval_data_file=../preprocess/dataset/test_subs_2400_2800.jsonl \
    --test_data_file=../preprocess/dataset/test.jsonl \
    --code_length 512 \
    --data_flow_length 128 \
    --eval_batch_size 16 \
    --seed 123456  2>&1 | tee attack_mhm_2400_2800.log &