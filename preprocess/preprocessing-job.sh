#!/bin/bash -l

#$ -N preprocessing-job
#$ -l h_vmem=600G
#$ -cwd
#$ -o /home/y_shi202/python-projects/APR-Refactoring/preprocess/job/

# set environment
module load anaconda/3.2019.10/default
module load cuda/10.1/default
module load python/3.6.8/default
cd /home/y_shi202/python-projects/APR-Refactoring/preprocess
source activate modit

echo "######## start ##############";
bash preprocessing.sh;
echo "######## end ################";
