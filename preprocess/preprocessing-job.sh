#!/bin/bash -l

CODE_DIR=$(realpath ../)

#$ -N preprocessing-job
#$ -l h_vmem=680G
#$ -cwd
#$ -m bea
#$ -M shi.yu.general@gmail.com

# set environment
module load anaconda/3.2019.10/default
module load python/3.6.8/default
cd ${CODE_DIR}/preprocess
source activate modit

echo "######## start ##############";
bash preprocessing.sh;
#bash preprocessing_abstract.sh;
echo "######## end ################";
