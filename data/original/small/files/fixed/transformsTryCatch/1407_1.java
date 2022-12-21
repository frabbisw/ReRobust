public synchronized void start(de.mickare.xserver.ServerThreadPoolExecutor stpool) {
    try {
        if ((task.get()) == null) {
            task.set(stpool.runServerTask(this));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
