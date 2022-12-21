public void start() {
    try {
        checkingThread.start();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (isMaster) {
        resourceManagerReadThread.start();
    }
}
