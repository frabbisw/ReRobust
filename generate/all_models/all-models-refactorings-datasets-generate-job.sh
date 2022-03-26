#!/bin/bash -l

#$ -N all-models-refactorings-datasets-generate-job
#$ -l h_vmem=600G,g=1
#$ -cwd
#$ -m bea
#$ -M shi.yu.general@gmail.com
#$ -o /home/y_shi202/python-projects/APR-Refactoring/generate/job/

# set environment
module load anaconda/3.2019.10/default
module load cuda/10.1/default
module load python/3.6.8/default
cd /home/y_shi202/python-projects/APR-Refactoring/generate/all_models
conda activate modit

echo "######## start ##############"
bash all-models-refactorings-datasets-generate-batch.sh
echo "######## end ################"
