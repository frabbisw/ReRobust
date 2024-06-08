#!/bin/bash -l

CODE_DIR=$(realpath ../../)

#$ -N original-preprocessing-job
#$ -l h_vmem=600G
#$ -cwd

# set environment
module load anaconda/3.2019.10/default
module load cuda/10.1/default
module load python/3.6.8/default
cd ${CODE_DIR}/preprocess/original
source activate modit

echo "######## start ##############";
bash preprocessing.sh;
echo "######## end ################";
