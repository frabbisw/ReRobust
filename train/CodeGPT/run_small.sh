mkdir -p ./saved_models/small/
data_dir=../data/small

python run.py \
        --do_train \
        --do_eval \
        --do_test \
        --model_type gpt2 \
        --model_name_or_path microsoft/CodeGPT-small-java-adaptedGPT2 \
        --train_filename $data_dir/train.buggy-fixed.buggy,$data_dir/train.buggy-fixed.fixed \
        --dev_filename $data_dir/valid.buggy-fixed.buggy,$data_dir/valid.buggy-fixed.fixed \
        --test_filename $data_dir/test.buggy-fixed.buggy,$data_dir/test.buggy-fixed.fixed \
        --output_dir ./saved_models/small/ \
        --max_source_length 256 \
        --max_target_length 256 \
        --beam_size 5 \
        --train_batch_size 16 \
        --eval_batch_size 32 \
        --learning_rate 5e-5 \
        --num_train_epochs 30 \
        2>&1 | tee ./saved_models/small/train.log

#python /home/y_shi202/related-project/MODIT/PLBART/CodeBLEU/calc_code_bleu.py --refs /home/y_shi202/test/ISSTA22-CodeStudy/Task/Code-Refinement/codegpt/saved_models/test_-1.gold --hyp /home/y_shi202/test/ISSTA22-CodeStudy/Task/Code-Refinement/codegpt/saved_models/test_-1.output --lang java
#python /home/y_shi202/related-project/MODIT/PLBART/evaluator.py --ref /home/y_shi202/test/ISSTA22-CodeStudy/Task/Code-Refinement/codegpt/saved_models/test_-1.gold --pre /home/y_shi202/test/ISSTA22-CodeStudy/Task/Code-Refinement/codegpt/saved_models/test_-1.output