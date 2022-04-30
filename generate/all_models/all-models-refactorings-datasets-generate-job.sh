#!/bin/bash -l

CODE_DIR=$(realpath ../../)
JOB_OUTPUT=${CODE_DIR}/job/generate
if [ ! -d "$JOB_OUTPUT" ]; then
        mkdir -p $JOB_OUTPUT
fi
#$ -N all-models-refactorings-datasets-generate-job
#$ -l h_vmem=100G,g=1
#$ -cwd
#$ -m bea
#$ -M shi.yu.general@gmail.com
#$ -o /home/y_shi202/thesis-project/APR-Models-Performance/job/generate/

# set environment
module load anaconda/3.2019.10/default
module load cuda/10.1/default
module load python/3.6.8/default
cd ${CODE_DIR}/generate/all_models
conda activate modit

echo "######## start ##############"
bash all-models-refactorings-datasets-generate-batch.sh
echo "######## end ################"
