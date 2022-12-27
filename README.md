﻿Yu Shi Master Thesis Project - Concordia University

# Evaluating the Robustness of Deep Learning Models on Automated Program Repair

We present the repository of this work, including models, datasets and code.

### Environment Setup

- We employ 1×Nvidia Tesla V100 GPU with 32GB memory for all experiments infrastructure.
- Python 3.6, CUDA 10.1, Anaconda.
- Setup a conda environment for running models, install requirements follow [this](https://github.com/ThomasShiyu/APR-Models-Performance/blob/master/config/requirement.txt).


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

We fine-tune pre-trained models on Abstract BFPs and Concrete BFPs for program repair respectively.

- Models fine-tuned on Concrete BFPs can be downloaded from [here]().
- Models fine-tuned on Abstract BFPs can be downloaded from [here]().

### Datasets

- Abstract BFPs are originally released by [Tufano et al., 2019](https://sites.google.com/view/learning-fixes/), 
Concrete BFPs are original released by [Chakraborty & Ray, 2021](https://github.com/modit-team/MODIT). See the details about how they are extracted from these original repositories.
- We also provide a [link](https://drive.google.com/drive/u/3/folders/1NzWFVk8v8smlbqC6OOY5e4KymaaOPDLo), to download these 2 datasets.
- The 9 transformed datasets and corresponding original datasets are also in link above. Files named "before_refactoring" stand for original datasets, files named "after_refactoring" stand for transformed datasets.

### Code

- ../data: Abstract BFPs + Concrete BFPs.

- ../train: fine-tuning (training) code, see corresponding original mentioned above for details.

- ../generate: bash file for fine-tuning and inference.

- ../evaluate: calculate Accuracy@1 and CodeBLEU.

- ../preprocess: preprocessing and binary code.

- ../refactoring: renaming-related semantic-preserving transformations, and renaming substitution JSON file generated by GraphCodeBERT's masked language modelling.

- See [JavaTransformer](https://github.com/mdrafiqulrabin/JavaTransformer) for the detailed implementation of other six semantic-preserving transformations.

- See [attack-pretrain-models-of-code](https://github.com/soarsmu/attack-pretrain-models-of-code) for the details how to utilize pre-trained models to predict masked tokens for renaming-related transformations.

### Acknowledgement

We uses [Tufano et al.](https://sites.google.com/view/learning-fixes/), 
[MODIT](https://github.com/modit-team/MODIT), [PLBART](https://github.com/wasiahmad/PLBART), [Fairseq](https://github.com/pytorch/fairseq), 
[CodeBERT](https://github.com/microsoft/CodeBERT), [codeXglue](https://github.com/microsoft/CodeXGLUE), [SPT-Code](https://github.com/NougatCA/SPT-Code), 
[CodeT5](https://github.com/salesforce/CodeT5), [attack-pretrain-models-of-code](https://github.com/soarsmu/attack-pretrain-models-of-code), 
[JavaTransformer](https://github.com/mdrafiqulrabin/JavaTransformer).
We are very grateful that the above works make their code, data and models publicly available so that we can build this repository on top of their code.


