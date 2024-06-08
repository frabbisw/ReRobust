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

    # Create directory for plbart
    rm -r /home/f_rabbi/alltogether/$operation/plbart
    mkdir /home/f_rabbi/alltogether/$operation/plbart

    # Run Python scripts
    cd /home/f_rabbi/clm/clm-apr/plbart
    python humaneval_plbart.py /home/f_rabbi/clm/models/

    cd /home/f_rabbi/clm/clm-apr/humaneval/
    python validate_humaneval.py /home/f_rabbi/clm/clm-apr/humaneval/plbart_result/plbart_base_output_c1.json /home/f_rabbi/clm/clm-apr/humaneval/plbart_result/plbart_base_validate_c1.json /home/f_rabbi/clm/humaneval-java/
    python validate_humaneval.py /home/f_rabbi/clm/clm-apr/humaneval/plbart_result/plbart_base_output_c2.json /home/f_rabbi/clm/clm-apr/humaneval/plbart_result/plbart_base_validate_c2.json /home/f_rabbi/clm/humaneval-java/
    python validate_humaneval.py /home/f_rabbi/clm/clm-apr/humaneval/plbart_result/plbart_large_output_c1.json /home/f_rabbi/clm/clm-apr/humaneval/plbart_result/plbart_large_validate_c1.json /home/f_rabbi/clm/humaneval-java/
    python validate_humaneval.py /home/f_rabbi/clm/clm-apr/humaneval/plbart_result/plbart_large_output_c2.json /home/f_rabbi/clm/clm-apr/humaneval/plbart_result/plbart_large_validate_c2.json /home/f_rabbi/clm/humaneval-java/

    # Copy plbart results
    cp /home/f_rabbi/clm/clm-apr/humaneval/plbart_result/* /home/f_rabbi/alltogether/$operation/plbart/

    echo "Operation: $operation completed"
done


#rm /home/f_rabbi/clm/humaneval-java/src/main/java/humaneval/buggy/*
#rm /home/f_rabbi/clm/humaneval-java/src/test/java/humaneval/*
#
#cp /home/f_rabbi/alltogether/BooleanExchange/buggy/* /home/f_rabbi/clm/humaneval-java/src/main/java/humaneval/buggy/
#cp /home/f_rabbi/alltogether/BooleanExchange/test/* /home/f_rabbi/clm/humaneval-java/src/test/java/humaneval/
#cp /home/f_rabbi/alltogether/BooleanExchange/humaneval_loc.txt /home/f_rabbi/clm/clm-apr/humaneval/humaneval_loc.txt
#
#rm -r /home/f_rabbi/clm/humaneval-java/src_bak
#cp -r /home/f_rabbi/clm/humaneval-java/src /home/f_rabbi/clm/humaneval-java/src_bak
#
#rm -r /home/f_rabbi/alltogether/BooleanExchange/plbart
#mkdir /home/f_rabbi/alltogether/BooleanExchange/plbart
#
#cd /home/f_rabbi/clm/clm-apr/plbart
#python humaneval_plbart.py /home/f_rabbi/clm/models/
#
#cd /home/f_rabbi/clm/clm-apr/humaneval/
#python validate_humaneval.py /home/f_rabbi/clm/clm-apr/humaneval/plbart_result/plbart_base_output_c1.json /home/f_rabbi/clm/clm-apr/humaneval/plbart_result/plbart_base_validate_c1.json /home/f_rabbi/clm/humaneval-java/
#python validate_humaneval.py /home/f_rabbi/clm/clm-apr/humaneval/plbart_result/plbart_base_output_c2.json /home/f_rabbi/clm/clm-apr/humaneval/plbart_result/plbart_base_validate_c2.json /home/f_rabbi/clm/humaneval-java/
#python validate_humaneval.py /home/f_rabbi/clm/clm-apr/humaneval/plbart_result/plbart_large_output_c1.json /home/f_rabbi/clm/clm-apr/humaneval/plbart_result/plbart_large_validate_c1.json /home/f_rabbi/clm/humaneval-java/
#python validate_humaneval.py /home/f_rabbi/clm/clm-apr/humaneval/plbart_result/plbart_large_output_c2.json /home/f_rabbi/clm/clm-apr/humaneval/plbart_result/plbart_large_validate_c2.json /home/f_rabbi/clm/humaneval-java/
#
#cp /home/f_rabbi/clm/clm-apr/humaneval/plbart_result/* /home/f_rabbi/alltogether/BooleanExchange/plbart/
