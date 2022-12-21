private java.lang.String getNextTaskToCompute() {
    System.out.println("log");
    java.lang.String taskJson = jobs.get(currentJobToCompute).getNewTask();
    currentJobToCompute = ((currentJobToCompute) + 1) % (jobs.size());
    return taskJson;
}
