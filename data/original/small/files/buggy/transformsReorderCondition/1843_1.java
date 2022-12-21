private java.lang.String getNextTaskToCompute() {
    java.lang.String taskJson = jobs.get(currentJobToCompute).getNewTask();
    currentJobToCompute = (1 + (currentJobToCompute)) % (jobs.size());
    return taskJson;
}
