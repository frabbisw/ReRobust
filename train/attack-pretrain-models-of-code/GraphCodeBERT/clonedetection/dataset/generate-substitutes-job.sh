#!/bin/bash -l

#$ -N generate-substitutes-job
#$ -l h_vmem=50G,g=1
#$ -cwd
#$ -m bea
#$ -M shi.yu.general@gmail.com

# set environment
module load anaconda/3.2019.10/default
module load cuda/10.1/default
module load python/3.6.8/default
conda activate modit-lstm

echo "######## start ##############";
bash generate.sh
echo "######## end ################";