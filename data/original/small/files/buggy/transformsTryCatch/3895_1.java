public void start() {
    checkingThread.start();
    nodeManagerReadThread.start();
    try {
        if (isMaster) {
            resourceManagerReadThread.start();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
