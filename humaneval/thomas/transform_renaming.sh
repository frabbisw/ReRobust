cd ..
if [ ! -d "attack-pretrain-models-of-code" ] ; then
    git clone https://github.com/soarsmu/attack-pretrain-models-of-code.git
fi
mkdir humaneval/data/* attack-pretrain-models-of-code/GraphCodeBERT/clonedetection/dataset/humaneval
cp humaneval/data/* attack-pretrain-models-of-code/GraphCodeBERT/clonedetection/dataset/humaneval/

cp humaneval/generate.sh attack-pretrain-models-of-code/GraphCodeBERT/clonedetection/dataset/
cp humaneval/get_substitutes.py attack-pretrain-models-of-code/GraphCodeBERT/clonedetection/dataset/

cp train/attack-pretrain-models-of-code/python_parser/parser_folder/my-languages.so ../attack-pretrain-models-of-code/python_parser/parser_folder/

#pip install tree-sitter==0.20.1

cd attack-pretrain-models-of-code/GraphCodeBERT/clonedetection/dataset
bash generate.sh
cd ../../../../humaneval
cp ../attack-pretrain-models-of-code/GraphCodeBERT/clonedetection/dataset/generate-substitutes.jsonl ./
bash divide_data.sh