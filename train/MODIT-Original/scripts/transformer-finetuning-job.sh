#!/bin/bash -l

#$ -N transformer-finetuning-job
#$ -l h_vmem=100G,g=1
#$ -cwd
#$ -m bea
#$ -M shi.yu.general@gmail.com

# set environment
module load anaconda/3.2019.10/default
module load cuda/10.1/default
module load python/3.6.8/default
conda activate modit-lstm

echo "######## start ##############";
bash transformer-finetuning.sh;
echo "######## end ################";
