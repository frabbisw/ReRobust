private void cancelAllJobs() {
    cancelJob(fetchQStatInfoJob);
    cancelJob(fillTableJob);
    try {
        cancelJob(plotDataJob);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
