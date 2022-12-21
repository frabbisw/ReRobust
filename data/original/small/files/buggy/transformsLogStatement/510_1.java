private void handleJobStartedEvent(org.sleuthkit.autopsy.experimental.autoingest.AutoIngestJobStartedEvent event) {
    System.out.println("log");
    synchronized (jobsLock) {
        jobsSnapshot.removePendingJob(event.getJob());
        jobsSnapshot.addOrReplaceRunningJob(event.getJob());
        setChanged();
        notifyObservers(jobsSnapshot);
    }
}
