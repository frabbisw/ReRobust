library(readxl)
library(dplyr)
library(ggplot2)
library(ggthemes)
library(grid)
library(reshape2)
library(forcats)


#########################################   RQ1   #########################################################
# concrete and abstract accuracy, group p1 and p2
dataRQ1 <- read_excel("E:/PythonProjects/APR-Models-Performance/evaluate/experiment result1.xlsx", sheet = 'sheet2', col_names = FALSE)
dataRQ1$...1 <- factor(dataRQ1$...1, 
                       levels = c("CodeBERT","GraphCodeBERT","CodeGPT","CodeT5-base","CodeT5-small","SPT-Code","PLBART","Transformer-based","LSTM-based"))
dataRQ1$...3 <- factor(dataRQ1$...3, levels = c("abstract BFPs", "concrete BFPs"))
p1_2<-ggplot(data=dataRQ1, mapping=aes(x = ...1, y = ...4, fill = fct_rev(...2)))+
  facet_wrap(dataRQ1$...3)+
  geom_bar(stat="identity", position=position_dodge(0.5), colour = "black", width = 0.5)+
  scale_fill_grey(start = 0.7, end = 1)+
  labs(x = 'Models', y = 'Accuracy(%)')+
  guides(fill = guide_legend(title = "Datasets", title.position = "top"))+
#  ggtitle("The repair accuracy of subject models on abstract BFPs and concrete BFPs")+
  # geom_text(mapping = aes(label= ...3), size = 3, colour = 'black', vjust = -0.4, hjust = .5, angle=90, position = position_dodge(0.5))+
  theme(plot.title = element_text(hjust = 0.5), axis.text.x  = element_text(angle=90, vjust=0.5))
p1_2
ggsave(p1_2, filename = "RQ1_abstract_concrete_accuracy.jpg", path = "C:\\Users\\12151\\Desktop\\experiment pictures\\new")


# concrete and abstract accuracy comparison, group p3 and p4
dataRQ1 <- read_excel("E:/PythonProjects/APR-Models-Performance/evaluate/experiment result1.xlsx", sheet = 'sheet2', col_names = FALSE)
dataRQ1$...1 <- factor(dataRQ1$...1, 
                          levels = c("CodeBERT","GraphCodeBERT","CodeGPT","CodeT5-base","CodeT5-small","SPT-Code","PLBART","Transformer-based","LSTM-based"))
p3_4<-ggplot(dataRQ1,aes(x=...1,y=...4,fill=...3))+
  facet_wrap(fct_rev(dataRQ1$...2))+
  geom_bar(stat="identity",position=position_dodge(0.5), colour = "black", width = 0.5)+
  scale_fill_grey(start = 0.7, end = 1)+
  labs(x = 'Models', y = 'Accuracy(%)')+
  guides(fill = guide_legend(title = "Datasets version", title.position = "top"))+
#  ggtitle("The repair accuracy comparison of subject models on abstract BFPs and concrete BFPs")+
  #  geom_text(mapping = aes(label= ...4), size = 2.5, colour = 'black', vjust = -0.4, hjust = .5, position = position_dodge(0.5))+
  theme(plot.title = element_text(hjust = 0.5), axis.text.x  = element_text(angle=90, vjust=0.5))
p3_4
ggsave(p3_4, filename = "RQ1_abstract_concrete_comparison.jpg", path = "C:\\Users\\12151\\Desktop\\experiment pictures\\new")



# concrete and abstract CodeBLEU
dataRQ1 <- read_excel("E:/PythonProjects/APR-Models-Performance/evaluate/experiment result1.xlsx", sheet = 'sheet2', col_names = FALSE)
dataRQ1$...1 <- factor(dataRQ1$...1, 
                       levels = c("CodeBERT","GraphCodeBERT","CodeGPT","CodeT5-base","CodeT5-small","SPT-Code","PLBART","Transformer-based","LSTM-based"))
dataRQ1$...3 <- factor(dataRQ1$...3, levels = c("abstract BFPs", "concrete BFPs"))
p1_2_codebleu<-ggplot(data=dataRQ1, mapping=aes(x = ...1, y = ...5, fill = fct_rev(...2)))+
  facet_wrap(dataRQ1$...3)+
  geom_bar(stat="identity", position=position_dodge(0.5), colour = "black", width = 0.5)+
  scale_fill_grey(start = 0.7, end = 1)+
  labs(x = 'Models', y = 'CodeBLEU')+
  guides(fill = guide_legend(title = "Datasets", title.position = "top"))+
  #  ggtitle("The repair CodeBLEU of subject models on abstract BFPs and concrete BFPs")+
  # geom_text(mapping = aes(label= ...3), size = 3, colour = 'black', vjust = -0.4, hjust = .5, angle=90, position = position_dodge(0.5))+
  theme(plot.title = element_text(hjust = 0.5), axis.text.x  = element_text(angle=90, vjust=0.5))
p1_2_codebleu
ggsave(p1_2_codebleu, filename = "RQ1_abstract_concrete_codebleu.jpg", path = "C:\\Users\\12151\\Desktop\\experiment pictures\\new")


# concrete and abstract CodeBLEU comparison
dataRQ1 <- read_excel("E:/PythonProjects/APR-Models-Performance/evaluate/experiment result1.xlsx", sheet = 'sheet2', col_names = FALSE)
dataRQ1$...1 <- factor(dataRQ1$...1, 
                       levels = c("CodeBERT","GraphCodeBERT","CodeGPT","CodeT5-base","CodeT5-small","SPT-Code","PLBART","Transformer-based","LSTM-based"))
p3_4_codebleu<-ggplot(dataRQ1,aes(x=...1,y=...5,fill=...3))+
  facet_wrap(fct_rev(dataRQ1$...2))+
  geom_bar(stat="identity",position=position_dodge(0.5), colour = "black", width = 0.5)+
  scale_fill_grey(start = 0.7, end = 1)+
  labs(x = 'Models', y = 'CodeBLEU')+
  guides(fill = guide_legend(title = "Datasets version", title.position = "top"))+
  #  ggtitle("The repair CodeBLEU comparison of subject models on abstract BFPs and concrete BFPs")+
  #  geom_text(mapping = aes(label= ...4), size = 2.5, colour = 'black', vjust = -0.4, hjust = .5, position = position_dodge(0.5))+
  theme(plot.title = element_text(hjust = 0.5), axis.text.x  = element_text(angle=90, vjust=0.5))
p3_4_codebleu
ggsave(p3_4_codebleu, filename = "RQ1_abstract_concrete_codebleu_comparison.jpg", path = "C:\\Users\\12151\\Desktop\\experiment pictures\\new")







#########################################   RQ2   #########################################################
# all data, original and transformed, x-axis is models, y-axis is accuracy
dataRQ2 <- read_excel("E:/PythonProjects/APR-Models-Performance/evaluate/experiment result1.xlsx", sheet = 'sheet3', col_names = FALSE)
dataRQ2$...2 <- factor(dataRQ2$...2, 
                          levels = c("CodeBERT","GraphCodeBERT","CodeGPT","CodeT5-base","CodeT5-small","SPT-Code","PLBART","Transformer-based","LSTM-based"))
p5<-ggplot(dataRQ2, aes(x=...2, y=...5, fill=...4))+
  facet_wrap(fct_rev(dataRQ2$...1))+
  geom_boxplot()+
  scale_fill_grey(start = 0.7, end = 1)+
  labs(x="Models",y="Accuracy(%)")+
  guides(fill = guide_legend(title = "", title.position = "top"))+
#  ggtitle("The repair accuracy distribution of subject models against different semantic-preserving transformations")+
  theme(plot.title = element_text(hjust = 0.5), axis.text.x  = element_text(angle=90, vjust=0.5))
p5
ggsave(p5, filename = "RQ2_model_transformations.jpg", path = "C:\\Users\\12151\\Desktop\\experiment pictures\\new")


# all data, original and transformed, x-axis is transformations, y-axis is accuracy
dataRQ2$...3 <- factor(dataRQ2$...3, 
                       levels = c("local_variable_renaming","method_renaming","parameter_renaming","reorder_condition","convert_switch_to_if",
                                  "loop_exchange","boolean_exchange","insert_try_catch","insert_log_statement"))
p6<-ggplot(dataRQ2, aes(x=...3, y=...5, fill=...4))+
  facet_wrap(fct_rev(dataRQ2$...1))+
  geom_boxplot()+
  scale_fill_grey(start = 0.7, end = 1)+
  labs(x="Transformations",y="Accuracy(%)")+
  guides(fill = guide_legend(title = "", title.position = "top"))+
#  ggtitle("The repair accuracy distribution of semantic-preserving transformations on subject models")+
  theme(plot.title = element_text(hjust = 0.5), axis.text.x  = element_text(angle=90, vjust=0.5))
p6
ggsave(p6, filename = "RQ2_transformations_model.jpg", path = "C:\\Users\\12151\\Desktop\\experiment pictures\\new")


# CodeBLEU
# all data, original and transformed, x-axis is models, y-axis is CodeBLEU
dataRQ2 <- read_excel("E:/PythonProjects/APR-Models-Performance/evaluate/experiment result1.xlsx", sheet = 'sheet3', col_names = FALSE)
dataRQ2$...2 <- factor(dataRQ2$...2, 
                       levels = c("CodeBERT","GraphCodeBERT","CodeGPT","CodeT5-base","CodeT5-small","SPT-Code","PLBART","Transformer-based","LSTM-based"))
p5_codebleu<-ggplot(dataRQ2, aes(x=...2, y=...6, fill=...4))+
  facet_wrap(fct_rev(dataRQ2$...1))+
  geom_boxplot()+
  scale_fill_grey(start = 0.7, end = 1)+
  labs(x="Models",y="CodeBLEU")+
  guides(fill = guide_legend(title = "", title.position = "top"))+
  #  ggtitle("The repair CodeBLEU distribution of subject models against different semantic-preserving transformations")+
  theme(plot.title = element_text(hjust = 0.5), axis.text.x  = element_text(angle=90, vjust=0.5))
p5_codebleu
ggsave(p5_codebleu, filename = "RQ2_model_transformations_codebleu.jpg", path = "C:\\Users\\12151\\Desktop\\experiment pictures\\new")


# all data, original and transformed, x-axis is transformations, y-axis is CodeBLEU
dataRQ2$...3 <- factor(dataRQ2$...3, 
                       levels = c("local_variable_renaming","method_renaming","parameter_renaming","reorder_condition","convert_switch_to_if",
                                  "loop_exchange","boolean_exchange","insert_try_catch","insert_log_statement"))
p6_codebleu<-ggplot(dataRQ2, aes(x=...3, y=...6, fill=...4))+
  facet_wrap(fct_rev(dataRQ2$...1))+
  geom_boxplot()+
  scale_fill_grey(start = 0.7, end = 1)+
  labs(x="Transformations",y="CodeBLEU")+
  guides(fill = guide_legend(title = "", title.position = "top"))+
  #  ggtitle("The repair CodeBLEU distribution of semantic-preserving transformations on subject models")+
  theme(plot.title = element_text(hjust = 0.5), axis.text.x  = element_text(angle=90, vjust=0.5))
p6_codebleu
ggsave(p6_codebleu, filename = "RQ2_transformations_model_codebleu.jpg", path = "C:\\Users\\12151\\Desktop\\experiment pictures\\new")














#########################################   RQ1   #########################################################
dataRQ1 <- read_excel("E:/PythonProjects/APR-Models-Performance/evaluate/experiment result1.xlsx", sheet = 'sheet2', col_names = FALSE)
rownames(dataRQ1)
colnames(dataRQ1)

dataRQ1$...1 <- factor(dataRQ1$...1, 
                       levels = c("CodeBERT","GraphCodeBERT","CodeGPT","CodeT5-base","CodeT5-small","SPT-Code","PLBART","Transformer-based","LSTM-based"))
# abstract dataset
dataRQ1_abstract <- dataRQ1[which(dataRQ1$...3=='abstract BFPs'),] #abstract BFPs
p1<-ggplot(data=dataRQ1_abstract, mapping=aes(x = ...1, y = ...4, fill = fct_rev(...2)))+
  geom_bar(stat="identity", position=position_dodge(0.5), colour = "black", width = 0.5)+
  scale_fill_grey(start = 0.7, end = 1)+
  labs(x = 'Models', y = 'Accuracy(%)')+
  guides(fill = guide_legend(title = "Datasets", title.position = "top"))+
  ggtitle("The repair accuracy of 9 models on abstract BFPs")+
  # geom_text(mapping = aes(label= ...3), size = 3, colour = 'black', vjust = -0.4, hjust = .5, angle=90, position = position_dodge(0.5))+
  theme(plot.title = element_text(hjust = 0.5), axis.text.x  = element_text(angle=90, vjust=0.5))
p1
ggsave(p1, filename = "RQ1_abstract_accuracy.jpg", path = "C:\\Users\\12151\\Desktop\\experiment pictures\\new")
# concrete dataset
dataRQ1_concrete <- dataRQ1[which(dataRQ1$...3=='concrete BFPs'),] #abstract BFPs
p2<-ggplot(data=dataRQ1_concrete, mapping=aes(x = ...1, y = ...4, fill = fct_rev(...2)))+
  geom_bar(stat="identity", position=position_dodge(0.5), colour = "black", width = 0.5)+
  scale_fill_grey(start = 0.7, end = 1)+
  labs(x = 'Models', y = 'Accuracy(%)')+
  guides(fill = guide_legend(title = "Datasets", title.position = "top"))+
  ggtitle("The repair accuracy of 9 models on concrete BFPs")+
  # geom_text(mapping = aes(label= ...4), size = 3, colour = 'black', vjust = -0.4, hjust = .5, angle=90, position = position_dodge(0.5))+
  theme(plot.title = element_text(hjust = 0.5), axis.text.x  = element_text(angle=90, vjust=0.5))
p2
ggsave(p2, filename = "RQ1_concrete_accuracy.jpg", path = "C:\\Users\\12151\\Desktop\\experiment pictures\\new")




# concrete and abstract比对
dataRQ1_ac <- read_excel("E:/PythonProjects/APR-Models-Performance/evaluate/experiment result1.xlsx", sheet = 'sheet2', col_names = FALSE)
dataRQ1_ac$...1 <- factor(dataRQ1_ac$...1, 
                          levels = c("CodeBERT","GraphCodeBERT","CodeGPT","CodeT5-base","CodeT5-small","SPT-Code","PLBART","Transformer-based","LSTM-based"))
abstract_concrete_data_small <- dataRQ1_ac[which(dataRQ1_ac$...2=='BFPs-small'),] #BFPs-small
p3<-ggplot(abstract_concrete_data_small,aes(x=...1,y=...4,fill=...3))+
  geom_bar(stat="identity",position=position_dodge(0.5), colour = "black", width = 0.5)+
  scale_fill_grey(start = 0.7, end = 1)+
  labs(x = 'Models', y = 'Accuracy(%)')+
  guides(fill = guide_legend(title = "Datasets version", title.position = "top"))+
  ggtitle("The repair accuracy of 9 models on abstract and concrete BFPs-small")+
  #  geom_text(mapping = aes(label= ...4), size = 2.5, colour = 'black', vjust = -0.4, hjust = .5, position = position_dodge(0.5))+
  theme(plot.title = element_text(hjust = 0.5), axis.text.x  = element_text(angle=90, vjust=0.5))
p3
ggsave(p3, filename = "RQ1_abstract_concrete_small.jpg", path = "C:\\Users\\12151\\Desktop\\experiment pictures\\new")

# concrete and abstract比对
abstract_concrete_data_medium <- dataRQ1_ac[which(dataRQ1_ac$...2=='BFPs-medium'),] #BFPs-medium
p4<-ggplot(abstract_concrete_data_medium,aes(x=...1,y=...4,fill=...3))+
  geom_bar(stat="identity",position=position_dodge(0.5), colour = "black", width = 0.5)+
  scale_fill_grey(start = 0.7, end = 1)+
  labs(x = 'Models', y = 'Accuracy(%)')+
  guides(fill = guide_legend(title = "Datasets version", title.position = "top"))+
  ggtitle("The repair accuracy of 9 models on abstract and concrete BFPs-medium")+
  #  geom_text(mapping = aes(label= ...4), size = 2.5, colour = 'black', vjust = -0.4, hjust = .5, position = position_dodge(0.5))+
  theme(plot.title = element_text(hjust = 0.5), axis.text.x  = element_text(angle=90, vjust=0.5))
p4
ggsave(p4, filename = "RQ1_abstract_concrete_medium.jpg", path = "C:\\Users\\12151\\Desktop\\experiment pictures\\new")




