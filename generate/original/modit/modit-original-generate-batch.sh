#!/bin/bash

echo "#############################################################################################";
echo "Experiment for modit-original";
echo "=============================================================================================";
echo "small dataset"
echo "---------------------------------------------------------------------------------------------";
bash modit-original-generate.sh small;
echo "---------------------------------------------------------------------------------------------";
echo "medium dataset"
echo "---------------------------------------------------------------------------------------------";
bash modit-original-generate.sh medium;