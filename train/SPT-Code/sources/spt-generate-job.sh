#!/bin/bash -l

#$ -N spt-generate-job
#$ -l h_vmem=100G,g=1
#$ -cwd
#$ -m bea
#$ -M shi.yu.general@gmail.com

# set environment
module load anaconda/3.2019.10/default
module load cuda/10.1/default
module load python/3.7.3/default
conda activate spt-code

function spt_generate_all() {
  for REFACTORING_TYPE in local_variable_renaming method_renaming parameter_renaming \
  boolean_exchange convert_switch_to_if insert_log_statement \
  insert_try_catch loop_exchange reorder_condition; do
    for DATA_SIZE in small medium; do
      for WHETHER_REFACTORING in before_refactoring after_refactoring; do
        echo "Start on ${DATA_SIZE} dataset, ${WHETHER_REFACTORING}, refactoring type is ${REFACTORING_TYPE}:"
        python main.py --only-test \
          --task bug_fix \
          --bug-fix-scale ${DATA_SIZE} \
          --trained-vocab "../pre_trained/vocabs/" \
          --trained-model "../fine_tuned_models_final/${DATA_SIZE}/" \
          --dataset-root "../../refactoring-dataset/${REFACTORING_TYPE}/${WHETHER_REFACTORING}/";
        echo "Finish on ${DATA_SIZE} dataset, ${WHETHER_REFACTORING}, refactoring type is ${REFACTORING_TYPE}:"
        echo "---------------------------------------------------------------------------------------------"
      done
    done
  done
}

echo "######## start ##############";
spt_generate_all;
echo "######## end ################";

#python /home/y_shi202/related-project/MODIT/PLBART/CodeBLEU/calc_code_bleu.py --refs /home/y_shi202/test/SPT-Code/outputs/default_model_20221020_223741/bug_fix_test_refs.txt --hyp /home/y_shi202/test/SPT-Code/outputs/default_model_20221020_223741/bug_fix_test_cans.txt --lang java
#python /home/y_shi202/related-project/MODIT/PLBART/evaluator.py --ref /home/y_shi202/test/SPT-Code/outputs/default_model_20221020_223741/bug_fix_test_refs.txt --pre /home/y_shi202/test/SPT-Code/outputs/default_model_20221020_223741/bug_fix_test_cans.txt

