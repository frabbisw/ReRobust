#!/bin/bash -l

CODE_DIR=$(realpath ../)
JOB_OUTPUT=${CODE_DIR}/job/preprocess
if [ ! -d "$JOB_OUTPUT" ]; then
        mkdir -p $JOB_OUTPUT
fi
#$ -N preprocessing-job
#$ -l h_vmem=600G
#$ -cwd
#$ -o ${JOB_OUTPUT}

# set environment
module load anaconda/3.2019.10/default
module load cuda/10.1/default
module load python/3.6.8/default
cd ${CODE_DIR}/preprocess
source activate modit

echo "######## start ##############";
bash preprocessing.sh;
echo "######## end ################";
