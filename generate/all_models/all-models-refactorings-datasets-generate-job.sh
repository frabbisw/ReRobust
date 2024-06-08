#!/bin/bash -l

CODE_DIR=$(realpath ../../)

#$ -N all-models-refactorings-datasets-generate-job
#$ -l m_mem_free=60G,g=1
# $ -cwd
#$ -m bea
#$ -M shi.yu.general@gmail.com

# set environment
module load anaconda/3.2019.10/default
module load cuda/10.1/default
module load python/3.6.8/default
cd ${CODE_DIR}/generate/all_models
conda activate modit

echo "######## start ##############"
bash all-models-refactorings-datasets-generate-batch.sh
echo "######## end ################"
