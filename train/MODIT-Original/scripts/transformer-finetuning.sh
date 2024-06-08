#!/bin/bash\

current_dir=$(pwd);
base_path=$(realpath ../);

PLBART_PATH="${base_path}/PLBART";
cd ${PLBART_PATH};
echo "#############################################################################################";
echo "Experiment for Transformer-S2S";
echo "=============================================================================================";
echo "Small Dataset:"
echo "---------------------------------------------------------------------------------------------";
bash transformer_s2s.sh 0 small parent_code child_full_code;
echo "Medium Dataset:"
echo "---------------------------------------------------------------------------------------------";
bash transformer_s2s.sh 0 medium parent_code child_full_code;
echo "#############################################################################################";
