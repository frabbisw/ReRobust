library(readxl)
library(dplyr)
library(ggplot2)
library(ggthemes)
library(grid)
library(reshape2)
library(forcats)


data <- read_excel("E:/PythonProjects/APR-Refactoring/evaluate/experiment result.xlsx", sheet = 'sheet1', col_names = FALSE)
rownames(data)
colnames(data)





data_local_variable_renaming_small <- data[c(1:10), c(1:5)]
p1<-ggplot(data=data_local_variable_renaming_small, mapping=aes(x = ...3, y = ...5, fill = fct_rev(...4)))+
  geom_bar(stat="identity",position=position_dodge(0.5), colour = "black", width = 0.5)+
  scale_fill_brewer(palette="Pastel1")+
  labs(x = 'Models', y = 'Accuracy(%)')+
  guides(fill = guide_legend(title = "renaming local variables", title.position = "top"))+
  ggtitle("The prediction accuracy of 5 models on small dataset")+
  geom_text(mapping = aes(label= ...5), size = 3, colour = 'black', vjust = 1.2, hjust = .5, position = position_dodge(0.5))+
  theme(plot.title = element_text(hjust = 0.5))
p1

data_accuracy_reduce <- data[seq(0,nrow(data),2), c(1:4,7)]
data_accuracy_reduce_small <- data_accuracy_reduce[which(data_accuracy_reduce$...2=='small'),]
p2<-ggplot(data_accuracy_reduce_small,aes(x=...1,y=...7,fill=...3))+
  geom_bar(stat="identity",position=position_dodge(0.5), colour = "black", width = 0.5)+
  scale_fill_brewer(palette="Pastel1")+
  labs(x="Refactoring Types",y="Accuracy Reduce(%)")+
  guides(fill = guide_legend(title = "Models", title.position = "top"))+
  ggtitle("The accuracy reduce of 3 refactoring types on 5 models on small dataset")+
  geom_text(mapping = aes(label= ...7), size = 2.5, colour = 'black', vjust = -0.4, hjust = .5, position = position_dodge(0.5))+
  theme(plot.title = element_text(hjust = 0.5))
p2







data_accuracy_reduce <- data[seq(0,nrow(data),2), c(1:4,7)]
data_accuracy_reduce_small <- data_accuracy_reduce[which(data_accuracy_reduce$...2=='small'),]
p2<-ggplot(data_accuracy_reduce_small,aes(x=...1,y=...7,fill=...3))+
  geom_bar(stat="identity",position=position_dodge(0.5), colour = "black", width = 0.5)+
  scale_fill_brewer(palette="Pastel1")+
  labs(x="Refactoring Types",y="Accuracy Reduce(%)")+
  guides(fill = guide_legend(title = "Models", title.position = "top"))+
  ggtitle("The accuracy reduce of 3 refactoring types on 5 models on small dataset")+
  geom_text(mapping = aes(label= ...7), size = 2.5, colour = 'black', vjust = -0.4, hjust = .5, position = position_dodge(0.5))+
  theme(plot.title = element_text(hjust = 0.5))
p2
ggsave(p2, filename = "reduce_v1_small.jpg", path = "C:\\Users\\12151\\Desktop\\experiment pictures")

data_accuracy_reduce_medium <- data_accuracy_reduce[which(data_accuracy_reduce$...2=='medium'),]
p2.1<-ggplot(data_accuracy_reduce_medium,aes(x=...1,y=...7,fill=...3))+
  geom_bar(stat="identity",position=position_dodge(0.5), colour = "black", width = 0.5)+
  scale_fill_brewer(palette="Pastel1")+
  labs(x="Refactoring Types",y="Accuracy Reduce(%)")+
  guides(fill = guide_legend(title = "Models", title.position = "top"))+
  ggtitle("The accuracy reduce of 3 refactoring types on 5 models on medium dataset")+
  geom_text(mapping = aes(label= ...7), size = 2.5, colour = 'black', vjust = -0.4, hjust = .5, position = position_dodge(0.5))+
  theme(plot.title = element_text(hjust = 0.5))
p2.1
ggsave(p2.1, filename = "reduce_v1_medium.jpg", path = "C:\\Users\\12151\\Desktop\\experiment pictures")







data_accuracy_reduce <- data[seq(0,nrow(data),2), c(1:4,7)]
data_accuracy_reduce_small <- data_accuracy_reduce[which(data_accuracy_reduce$...2=='small'),]
p2_v<-ggplot(data_accuracy_reduce_small,aes(x=...3,y=...7,fill=...1))+
  geom_bar(stat="identity",position=position_dodge(0.5), colour = "black", width = 0.5)+
  scale_fill_brewer(palette="Pastel1")+
  labs(x="Models",y="Accuracy Reduce(%)")+
  guides(fill = guide_legend(title = "Refactoring Types", title.position = "top"))+
  ggtitle("The accuracy reduce of 3 refactoring types on 5 models on small dataset")+
  geom_text(mapping = aes(label= ...7), size = 2.5, colour = 'black', vjust = -0.4, hjust = .5, position = position_dodge(0.5))+
  theme(plot.title = element_text(hjust = 0.5))
p2_v
ggsave(p2_v, filename = "reduce_v2_small.jpg", path = "C:\\Users\\12151\\Desktop\\experiment pictures")

data_accuracy_reduce_medium <- data_accuracy_reduce[which(data_accuracy_reduce$...2=='medium'),]
p2_v.1<-ggplot(data_accuracy_reduce_medium,aes(x=...3,y=...7,fill=...1))+
  geom_bar(stat="identity",position=position_dodge(0.5), colour = "black", width = 0.5)+
  scale_fill_brewer(palette="Pastel1")+
  labs(x="Models",y="Accuracy Reduce(%)")+
  guides(fill = guide_legend(title = "Refactoring Types", title.position = "top"))+
  ggtitle("The accuracy reduce of 3 refactoring types on 5 models on medium dataset")+
  geom_text(mapping = aes(label= ...7), size = 2.5, colour = 'black', vjust = -0.4, hjust = .5, position = position_dodge(0.5))+
  theme(plot.title = element_text(hjust = 0.5))
p2_v.1
ggsave(p2_v.1, filename = "reduce_v2_medium.jpg", path = "C:\\Users\\12151\\Desktop\\experiment pictures")









data_accuracy_reduce <- data[seq(0,nrow(data),2), c(1:4,7)]
p2<-ggplot(data_accuracy_reduce, aes(x=...1,y=...7,fill=fct_rev(...2)))+
  facet_wrap(fct_rev(data_accuracy_reduce$...2),labeller=as_labeller(c('small' = "small dataset",'medium' = "medium dataset")))+
  geom_boxplot(width=0.3)+
  stat_summary(fun="mean", geom="point", color="red", alpha=0.5, size=1.5, position = position_dodge(0.75))+
  scale_fill_brewer(palette="Pastel1")+
  labs(x="Refactoring Types",y="Accuracy Reduce(%)")+
  guides(fill=FALSE)+
  ggtitle("The accuracy reduce of 3 refactoring types (before and after apply refactoring) on 5 models on 2 datasets")+
  theme(plot.title = element_text(hjust = 0.5))
p2
ggsave(p2, filename = "accuracy_reduce_box_V1.jpg", path = "C:\\Users\\12151\\Desktop\\experiment pictures")



data_accuracy_reduce <- data[seq(0,nrow(data),2), c(1:4,7)]
p2<-ggplot(data_accuracy_reduce, aes(x=...3,y=...7,fill=fct_rev(...2)))+
  facet_wrap(fct_rev(data_accuracy_reduce$...2),labeller=as_labeller(c('small' = "small dataset",'medium' = "medium dataset")))+
  geom_boxplot(width=0.3)+
  stat_summary(fun="mean", geom="point", color="red", alpha=0.5, size=1.5, position = position_dodge(0.75))+
  scale_fill_brewer(palette="Pastel1")+
  labs(x="Models",y="Accuracy Reduce(%)")+
  guides(fill=FALSE)+
  ggtitle("The accuracy reduce of 3 refactoring types (before and after apply refactoring) on 5 models on 2 datasets")+
  theme(plot.title = element_text(hjust = 0.5))
p2
ggsave(p2, filename = "accuracy_reduce_box_V2.jpg", path = "C:\\Users\\12151\\Desktop\\experiment pictures")







# all data, before refactoring and after refactoring, x-axis is refactoring types
data_accuracy <- data[, c(1:5)]
p2<-ggplot(data_accuracy, aes(x=...1,y=...5,fill=fct_rev(...4)))+
  facet_wrap(fct_rev(data_accuracy$...2),labeller=as_labeller(c('small' = "small dataset",'medium' = "medium dataset")))+
  geom_boxplot()+
  scale_fill_brewer(palette="Pastel1")+
  labs(x="Refactoring Types",y="Accuracy(%)")+
  guides(fill = guide_legend(title = "", title.position = "top"))+
  ggtitle("The accuracy of 3 refactoring types (before and after apply refactoring) on 5 models on 2 datasets")+
  theme(plot.title = element_text(hjust = 0.5))
p2
ggsave(p2, filename = "accuracy_box_V1.jpg", path = "C:\\Users\\12151\\Desktop\\experiment pictures")


# all data, before refactoring and after refactoring, x-axis is models
data_accuracy <- data[, c(1:5)]
p2<-ggplot(data_accuracy, aes(x=...3,y=...5,fill=fct_rev(...4)))+
  facet_wrap(fct_rev(data_accuracy$...2),labeller=as_labeller(c('small' = "small dataset",'medium' = "medium dataset")))+
  geom_boxplot()+
  scale_fill_brewer(palette="Pastel1")+
  labs(x="Models",y="Accuracy(%)")+
  guides(fill = guide_legend(title = "", title.position = "top"))+
  ggtitle("The accuracy of 3 refactoring types (before and after apply refactoring) on 5 models on 2 datasets")+
  theme(plot.title = element_text(hjust = 0.5))
p2
ggsave(p2, filename = "accuracy_box_V2.jpg", path = "C:\\Users\\12151\\Desktop\\experiment pictures")









