private void cancelAllJobs() {
    try {
        cancelJob(fetchQStatInfoJob);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
