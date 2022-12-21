public final void addCleanupTask(final java.lang.Runnable cleanupTask) {
    try {
        this.cleanupTasks.add(cleanupTask);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
