#!/bin/bash -l

#$ -N bug-fix-medium-job
#$ -l h_vmem=300G,g=1
#$ -cwd
#$ -m bea
#$ -M shi.yu.general@gmail.com

# set environment
module load anaconda/3.2019.10/default
module load cuda/10.1/default
module load python/3.7.3/default
conda activate spt-code

echo "######## start ##############";
# python main.py --do-fine-tune --train-from-scratch --task bug_fix --bug-fix-scale small;
python main.py --do-fine-tune --task bug_fix --bug-fix-scale medium --trained-vocab '../pre_trained/vocabs/' --trained-model '../pre_trained/models/all/';

# python main.py --do-fine-tune --task bug_fix --bug-fix-scale small --trained-vocab '../pre_trained/vocabs/' --trained-model '../pre_trained/models/all/' --dataset-root '../../dataset-custom/';

# python main.py --do-fine-tune --train-from-scratch --task bug_fix --bug-fix-scale medium;
echo "######## end ################";
