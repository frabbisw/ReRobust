#!/bin/bash -l

CODE_DIR=$(realpath ../../)
JOB_OUTPUT=${CODE_DIR}/job/generate
if [ ! -d "$JOB_OUTPUT" ]; then
        mkdir -p $JOB_OUTPUT
fi
#$ -N codegpt-generate-job
#$ -l h_vmem=600G,g=1
#$ -cwd
#$ -m bea
#$ -M shi.yu.general@gmail.com
#$ -o ${JOB_OUTPUT}

# set environment
module load anaconda/3.2019.10/default
module load cuda/10.1/default
module load python/3.6.8/default
cd ${CODE_DIR}/generate/CodeGPT
conda activate modit

echo "######## start ##############";
bash codegpt-generate-batch.sh;
echo "######## end ################";
