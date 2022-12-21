public java.lang.String getNextTaskToCompute() {
    java.lang.String taskJson = jobs.get(currentJobToCompute).getNewTask();
    try {
        currentJobToCompute = ((currentJobToCompute) + 1) % (jobs.size());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return taskJson;
}
