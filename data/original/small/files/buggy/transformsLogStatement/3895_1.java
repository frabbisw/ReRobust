public void start() {
    checkingThread.start();
    System.out.println("log");
    nodeManagerReadThread.start();
    if (isMaster) {
        resourceManagerReadThread.start();
    }
}
