#!/bin/bash -l

CODE_DIR=$(realpath ../../)

#$ -N graphcodebert-generate-job-2
#$ -l m_mem_free=100G,g=1
#$ -cwd
#$ -m bea
#$ -M shi.yu.general@gmail.com

# set environment
module load anaconda/3.2019.10/default
module load cuda/10.1/default
module load python/3.6.8/default
cd ${CODE_DIR}/generate/graphcodebert
conda activate modit

echo "######## start ##############";
bash graphcodebert-generate-batch-2.sh;
echo "######## end ################";
