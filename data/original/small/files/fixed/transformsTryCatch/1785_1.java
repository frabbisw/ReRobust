public final void addCleanupTask(final java.lang.Runnable cleanupTask) {
    try {
        synchronized (this.cleanupTasks) {
            this.cleanupTasks.add(cleanupTask);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
