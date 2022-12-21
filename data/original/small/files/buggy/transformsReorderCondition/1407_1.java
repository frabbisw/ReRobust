public void start(de.mickare.xserver.ServerThreadPoolExecutor stpool) {
    synchronized (task) {
        if (null == (task.get())) {
            task.set(stpool.runServerTask(this));
        }
    }
}
