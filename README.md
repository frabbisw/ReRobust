﻿Yu Shi Master Thesis Project - Concordia University

# Evaluating the Robustness of Deep Learning Models on Automated Program Repair

We present the repository of this work, including models, datasets, and code.

### Environment Setup

- We employ 1×Nvidia Tesla V100 GPU with 32GB memory for all experiments infrastructure.
- Python 3.6, CUDA 10.1, Anaconda.
- Setup a conda environment for running models and install requirements by following [this](https://github.com/ThomasShiyu/APR-Models-Performance/blob/master/config/requirement.txt).


### Models

#### Pre-trained Models

The pre-trained models are released by the corresponding repositories. 
See the instructions in these repositories to download and use these pre-trained models.

- [CodeBERT](https://github.com/microsoft/CodeBERT).
- [GraphCodeBERT](https://github.com/microsoft/CodeBERT/tree/master/GraphCodeBERT).
- [CodeGPT](https://github.com/microsoft/CodeXGLUE).
- [CodeT5](https://github.com/salesforce/CodeT5).
- [PLBART](https://github.com/wasiahmad/PLBART).
- [SPT-Code](https://github.com/NougatCA/SPT-Code).

#### Fine-tuned Models

We fine-tune pre-trained models on Abstract BFPs and Concrete BFPs for program repair, respectively.

- Models fine-tuned (trained) on Concrete BFPs can be downloaded from [here](https://zenodo.org/record/7487472#.Y64Jt3bMK3B). transformer model on Concrete BFPs can be downloaded from [here](https://drive.google.com/file/d/1rrQzr8JqRpAAT2CLv4xs8VbGtYvM9uHl/view?usp=sharing).
- Models fine-tuned (trained) on Abstract BFPs can be downloaded from [here](https://zenodo.org/record/7487490#.Y64Jq3bMK3B). transformer model on Abstract BFPs can be downloaded from [here](https://drive.google.com/file/d/1LfE4J5PeLhV_dZYtiagzLoyZof1AU_Hi/view?usp=sharing).

### Datasets

- Abstract BFPs are initially released by [Tufano et al., 2019](https://sites.google.com/view/learning-fixes/), 
Concrete BFPs are initially released by [Chakraborty & Ray, 2021](https://github.com/modit-team/MODIT). See the details about how they are extracted from these original repositories.
- We also provide a [link](https://drive.google.com/file/d/1xNjo48jOliT7vLmTMOYBRziRocwpDhPg/view?usp=sharing), to download these 2 datasets.
- The 9 transformed datasets and corresponding original datasets are also in the link above. Files named "before_refactoring" stand for original datasets, and files named "after_refactoring" stand for transformed datasets.

### Code

- ../data: Abstract BFPs and Concrete BFPs.

- ../train: fine-tuning (training) code, see the corresponding original mentioned above for details.

- ../generate: bash file for fine-tuning and inference.

- ../evaluate: calculate Accuracy@1 and CodeBLEU.

- ../preprocess: preprocess and binary code.

- ../refactoring: define 3 renaming-related semantic-preserving transformations and renaming substitution JSON file generated by GraphCodeBERT's masked language modeling.

For running RQ1, see the instructions in corresponding repositories on how to fine-tune pre-trained models.

For running RQ2, see scripts under ../generate and put datasets and fine-tuned models on corresponding directories. See [attack-pretrain-models-of-code](https://github.com/soarsmu/attack-pretrain-models-of-code) for the details on utilizing pre-trained models to predict masked tokens for renaming-related transformations. See [JavaTransformer](https://github.com/mdrafiqulrabin/JavaTransformer) for the detailed implementation of the other six semantic-preserving transformations.

### Acknowledgement
 
[MODIT](https://github.com/modit-team/MODIT), [PLBART](https://github.com/wasiahmad/PLBART), [Fairseq](https://github.com/pytorch/fairseq), 
[CodeBERT](https://github.com/microsoft/CodeBERT), [codeXglue](https://github.com/microsoft/CodeXGLUE), [SPT-Code](https://github.com/NougatCA/SPT-Code), 
[CodeT5](https://github.com/salesforce/CodeT5), [attack-pretrain-models-of-code](https://github.com/soarsmu/attack-pretrain-models-of-code), 
[JavaTransformer](https://github.com/mdrafiqulrabin/JavaTransformer), We use [Tufano et al.](https://sites.google.com/view/learning-fixes/).
We are very grateful that the above works make their code, datasets, and models publicly available so that we can build this repository on top of their works.


