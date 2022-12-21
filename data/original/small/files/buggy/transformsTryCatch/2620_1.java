public void quit() {
    quit = true;
    try {
        synchronized (syncThread) {
            syncThread.notify();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
