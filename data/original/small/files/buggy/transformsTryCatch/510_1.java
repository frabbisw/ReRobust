private void handleJobStartedEvent(org.sleuthkit.autopsy.experimental.autoingest.AutoIngestJobStartedEvent event) {
    try {
        synchronized (jobsLock) {
            jobsSnapshot.removePendingJob(event.getJob());
            jobsSnapshot.addOrReplaceRunningJob(event.getJob());
            setChanged();
            notifyObservers(jobsSnapshot);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
