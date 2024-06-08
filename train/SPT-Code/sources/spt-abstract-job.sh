#!/bin/bash -l

#$ -N spt-abstract-job
#$ -l h_vmem=100G,g=1
#$ -cwd
#$ -m bea
#$ -M shi.yu.general@gmail.com

# set environment
module load anaconda/3.2019.10/default
module load cuda/10.1/default
module load python/3.7.3/default
conda activate spt-code

echo "######## start ##############";
python main.py --do-fine-tune --task bug_fix --bug-fix-scale small --trained-vocab '../pre_trained/vocabs/' --trained-model '../pre_trained/models/all/';
python main.py --do-fine-tune --task bug_fix --bug-fix-scale medium --trained-vocab '../pre_trained/vocabs/' --trained-model '../pre_trained/models/all/';
echo "######## end ################";
