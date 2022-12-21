public final void addCleanupTask(final java.lang.Runnable cleanupTask) {
    System.out.println("log");
    this.cleanupTasks.add(cleanupTask);
}
