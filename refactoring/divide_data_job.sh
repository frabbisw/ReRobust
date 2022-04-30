#!/bin/bash -l

CODE_DIR=$(realpath ../../)
JOB_OUTPUT=${CODE_DIR}/job/refactoring
if [ ! -d "$JOB_OUTPUT" ]; then
        mkdir -p $JOB_OUTPUT
fi
#$ -N divide_data_job
#$ -l h_vmem=600G
#$ -cwd
#$ -o ${JOB_OUTPUT}

# set environment
module load anaconda/3.2019.10/default
module load cuda/10.1/default
module load python/3.6.8/default
cd ${CODE_DIR}/refactoring
source activate modit

echo "######## start ##############";
bash divide_data.sh;
echo "######## end ################";
