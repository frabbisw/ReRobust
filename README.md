Yu Shi Master Thesis Project - Concordia University

# Evaluating the Robustness of Deep Learning Models on Automated Program Repair

We present the repository of this work, including models, datasets, and code.

## Requirements:

1. `1×Nvidia Tesla V100 GPU with 32GB memory`
2. `Python 3.6`
3. `CUDA 10.1`

Please make sure all the packages in [`requirement.txt`](https://github.com/ThomasShiyu/APR-Models-Performance/blob/master/config/requirement.txt) are installed.

- Run `cat requirements.txt | xargs -n 1 pip install` for setting environment.

## Models

### Pre-trained Models

The pre-trained models are released by the corresponding repositories. 
See the instructions in these repositories to download and use these pre-trained models.

- [CodeBERT](https://github.com/microsoft/CodeBERT).
- [GraphCodeBERT](https://github.com/microsoft/CodeBERT/tree/master/GraphCodeBERT).
- [CodeGPT](https://github.com/microsoft/CodeXGLUE).
- [CodeT5](https://github.com/salesforce/CodeT5).
- [PLBART](https://github.com/wasiahmad/PLBART).
- [SPT-Code](https://github.com/NougatCA/SPT-Code).

### Fine-tuned Models

We fine-tune pre-trained models on Abstract BFPs and Concrete BFPs for program repair, respectively.

- Models fine-tuned (trained) on Concrete BFPs can be downloaded from [here](https://zenodo.org/record/7487472#.Y64Jt3bMK3B). transformer-based NMT model on Concrete BFPs can be downloaded from [here](https://drive.google.com/file/d/1rrQzr8JqRpAAT2CLv4xs8VbGtYvM9uHl/view?usp=sharing).
- Models fine-tuned (trained) on Abstract BFPs can be downloaded from [here](https://zenodo.org/record/7487490#.Y64Jq3bMK3B). transformer-based NMT model on Abstract BFPs can be downloaded from [here](https://drive.google.com/file/d/1LfE4J5PeLhV_dZYtiagzLoyZof1AU_Hi/view?usp=sharing).

## Datasets

- Abstract BFPs are initially released by [Tufano et al., 2019](https://sites.google.com/view/learning-fixes/), 
Concrete BFPs are initially released by [Chakraborty & Ray, 2021](https://github.com/modit-team/MODIT). See the details about how they are extracted from these original repositories.
- We also provide a [link](https://drive.google.com/file/d/1xNjo48jOliT7vLmTMOYBRziRocwpDhPg/view?usp=sharing), to download these 2 datasets.
- The 9 transformed datasets and corresponding original datasets are also in the link above. Files named "before_refactoring" stand for original datasets, and files named "after_refactoring" stand for transformed datasets.

## Experiment1 - RQ1

Please make sure the environment libraries mentioned above installed.

For fine-tuning CodeBERT, GraphCodeBERT, CodeGPT and PLBART, we reuse the code from [MODIT](https://github.com/modit-team/MODIT):
- `git clone https://github.com/modit-team/MODIT`
- Following the original instructions in [MODIT](https://github.com/modit-team/MODIT) to fine-tune these models.

For fine-tuning CodeT5, SPT-Code:
- `git clone https://github.com/salesforce/CodeT5`
- Following the original instructions in [CodeT5](https://github.com/salesforce/CodeT5) to fine-tune it.
- `git clone https://github.com/NougatCA/SPT-Code`
- Following the original instructions in [SPT-Code](https://github.com/NougatCA/SPT-Code) to fine-tune it.

## Experiment2 - RQ2

Please make sure the environment libraries mentioned above installed.

For testing the robustness of CodeBERT, CodeGPT, PLBART(MODIT), LSTM-based and Transformer-based models:

Models:

- Download fine-tuned models, then put the fine-tuned models on the corresponding directories.
- For example, CodeBERT model fine-tuned on small-BFPs of Concrete BFPs should be under the path: `APR-Models-Performance/models/original/codebert/small/pytorch_model.bin`

Dataset:

- Download transformed dataset mentioned above, put it under the path: `APR-Models-Performance/data/transformed/`

For testing the robustness of SPT-Code:

- Download fine-tuned SPT-Code on small-BFPs and medium-BFPs, then put them under `SPT-Code/fine_tuned_models_final/small/` and `SPT-Code/fine_tuned_models_final/medium/`

Dataset:

- Download transformed dataset mentioned above, put it under the path: `APR-Models-Performance/data/transformed/`

For testing the robustness of CodeT5:

- Download fine-tuned CodeT5-small on small-BFPs and medium-BFPs, then put them under `CodeT5/sh/fine_tuned_models_final/codet5-small/small/pytorch_model.bin` and `CodeT5/sh/fine_tuned_models_final/codet5-small/medium/pytorch_model.bin`
- Download fine-tuned CodeT5-base on small-BFPs and medium-BFPs, then put them under `CodeT5/sh/fine_tuned_models_final/codet5-base/small/pytorch_model.bin` and `CodeT5/sh/fine_tuned_models_final/codet5-base/medium/pytorch_model.bin`

Dataset:

- Download transformed dataset mentioned above, put it under the path: `APR-Models-Performance/data/transformed/`




## Code

- ../data: Abstract BFPs and Concrete BFPs.

- ../train: fine-tuning (training) code, see the corresponding original mentioned above for details.

- ../generate: bash file for fine-tuning and inference.

- ../evaluate: calculate Accuracy@1 and CodeBLEU.

- ../preprocess: preprocess and binary code.

- ../refactoring: define 3 renaming-related semantic-preserving transformations and renaming substitution JSON file generated by GraphCodeBERT's masked language modeling.

For running RQ1, see the instructions in corresponding repositories on how to fine-tune pre-trained models.

For running RQ2, see scripts under ../generate and put datasets and fine-tuned models on corresponding directories. See [attack-pretrain-models-of-code](https://github.com/soarsmu/attack-pretrain-models-of-code) for the details on utilizing pre-trained models to predict masked tokens for renaming-related transformations. See [JavaTransformer](https://github.com/mdrafiqulrabin/JavaTransformer) for the detailed implementation of the other six semantic-preserving transformations.

### Acknowledgement

We use [MODIT](https://github.com/modit-team/MODIT), [PLBART](https://github.com/wasiahmad/PLBART), [Fairseq](https://github.com/pytorch/fairseq), 
[CodeBERT](https://github.com/microsoft/CodeBERT), [codeXglue](https://github.com/microsoft/CodeXGLUE), [SPT-Code](https://github.com/NougatCA/SPT-Code), 
[CodeT5](https://github.com/salesforce/CodeT5), [attack-pretrain-models-of-code](https://github.com/soarsmu/attack-pretrain-models-of-code), 
[JavaTransformer](https://github.com/mdrafiqulrabin/JavaTransformer), [Tufano et al.](https://sites.google.com/view/learning-fixes/).
We are very grateful that the above works make their code, datasets, and models publicly available so that we can build this repository on top of their works.


