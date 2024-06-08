#!/bin/bash\

current_dir=$(pwd);
base_path=$(realpath ../);

GRAPH_CODEBERT_PATH="${base_path}/GraphCodeBERT";
cd ${GRAPH_CODEBERT_PATH};
echo "#############################################################################################";
echo "Experiment for GraphCodeBERT";
echo "=============================================================================================";
echo "Small Dataset:"
echo "---------------------------------------------------------------------------------------------";
bash run.sh 0 small parent_code child_full_code;
echo "Medium Dataset:"
echo "---------------------------------------------------------------------------------------------";
bash run.sh 0 medium parent_code child_full_code;
echo "#############################################################################################";

