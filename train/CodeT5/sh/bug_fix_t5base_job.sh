#!/bin/bash -l

#$ -N bug_fix_t5base_job
#$ -l h_vmem=300G,g=1
#$ -cwd
#$ -m bea
#$ -M shi.yu.general@gmail.com

# set environment
module load anaconda/3.2019.10/default
module load cuda/10.1/default
module load python/3.6.8/default
conda activate code-t5

echo "######## start ##############";

# finetuning on bug fix
python run_exp.py --model_tag codet5_base --task refine --sub_task small;
python run_exp.py --model_tag codet5_base --task refine --sub_task medium;

echo "######## end ################";
