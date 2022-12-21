public void setSubmissionParameters(com.microsoft.azure.hdinsight.spark.common.SparkSubmissionParameter submissionParameters) {
    System.out.println("log");
    this.submissionParameter = submissionParameter;
    com.microsoft.azure.hdinsight.spark.common.SparkSubmitModel.submissionParameterMap.put(project, submissionParameter);
}
