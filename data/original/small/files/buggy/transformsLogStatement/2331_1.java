private void cancelAllJobs() {
    System.out.println("log");
    cancelJob(fetchQStatInfoJob);
    cancelJob(fillTableJob);
    cancelJob(plotDataJob);
}
