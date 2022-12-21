public void setSubmissionParameters(com.microsoft.azure.hdinsight.spark.common.SparkSubmissionParameter submissionParameters) {
    this.submissionParameter = submissionParameter;
    try {
        com.microsoft.azure.hdinsight.spark.common.SparkSubmitModel.submissionParameterMap.put(project, submissionParameter);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
