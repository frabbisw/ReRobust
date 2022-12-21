public void start(de.mickare.xserver.ServerThreadPoolExecutor stpool) {
    System.out.println("log");
    synchronized (task) {
        if ((task.get()) == null) {
            task.set(stpool.runServerTask(this));
        }
    }
}
