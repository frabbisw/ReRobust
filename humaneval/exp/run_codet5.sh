#!/bin/bash

# Define operations
operations=("BooleanExchange" "LogStatement" "LoopExchange" "ReorderCondition" "TryCatch" "MethodRenaming" "VariableRenaming" "ParameterRenaming")

# Loop through each operation
for operation in "${operations[@]}"
do
    echo "Processing operation: $operation"

    # Copy files
    rm /home/f_rabbi/clm/humaneval-java/src/main/java/humaneval/buggy/*
    rm /home/f_rabbi/clm/humaneval-java/src/test/java/humaneval/*

    cp /home/f_rabbi/alltogether/$operation/buggy/* /home/f_rabbi/clm/humaneval-java/src/main/java/humaneval/buggy/
    cp /home/f_rabbi/alltogether/$operation/test/* /home/f_rabbi/clm/humaneval-java/src/test/java/humaneval/
    cp /home/f_rabbi/alltogether/$operation/humaneval_loc.txt /home/f_rabbi/clm/clm-apr/humaneval/humaneval_loc.txt

    # Backup source
    rm -r /home/f_rabbi/clm/humaneval-java/src_bak
    cp -r /home/f_rabbi/clm/humaneval-java/src /home/f_rabbi/clm/humaneval-java/src_bak

    # Create directory for codet5
    rm -r /home/f_rabbi/alltogether/$operation/codet5
    mkdir /home/f_rabbi/alltogether/$operation/codet5

    # Run Python scripts
    cd /home/f_rabbi/clm/clm-apr/codet5
    python humaneval_codet5.py /home/f_rabbi/clm/models/

    cd /home/f_rabbi/clm/clm-apr/humaneval/
#    python validate_humaneval.py /home/f_rabbi/clm/clm-apr/humaneval/codet5_result/codet5_base_output_c1.json /home/f_rabbi/clm/clm-apr/humaneval/codet5_result/codet5_base_validate_c1.json /home/f_rabbi/clm/humaneval-java/
    python validate_humaneval.py /home/f_rabbi/clm/clm-apr/humaneval/codet5_result/codet5_base_output_c3.json /home/f_rabbi/clm/clm-apr/humaneval/codet5_result/codet5_base_validate_c3.json /home/f_rabbi/clm/humaneval-java/
#    python validate_humaneval.py /home/f_rabbi/clm/clm-apr/humaneval/codet5_result/codet5_large_output_c1.json /home/f_rabbi/clm/clm-apr/humaneval/codet5_result/codet5_large_validate_c1.json /home/f_rabbi/clm/humaneval-java/
    python validate_humaneval.py /home/f_rabbi/clm/clm-apr/humaneval/codet5_result/codet5_large_output_c3.json /home/f_rabbi/clm/clm-apr/humaneval/codet5_result/codet5_large_validate_c3.json /home/f_rabbi/clm/humaneval-java/
    python validate_humaneval.py /home/f_rabbi/clm/clm-apr/humaneval/codet5_result/codet5_small_output_c1.json /home/f_rabbi/clm/clm-apr/humaneval/codet5_result/codet5_small_validate_c1.json /home/f_rabbi/clm/humaneval-java/
    python validate_humaneval.py /home/f_rabbi/clm/clm-apr/humaneval/codet5_result/codet5_small_output_c3.json /home/f_rabbi/clm/clm-apr/humaneval/codet5_result/codet5_small_validate_c3.json /home/f_rabbi/clm/humaneval-java/

    # Copy codet5 results
    cp /home/f_rabbi/clm/clm-apr/humaneval/codet5_result/* /home/f_rabbi/alltogether/$operation/codet5/

    echo "Operation: $operation completed"
done
