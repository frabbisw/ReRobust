public void schedule(java.lang.Runnable task, java.util.Calendar starts) {
    try {
        schedule(task, java.lang.System.currentTimeMillis(), starts.getTime().getTime(), 0, 0);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
