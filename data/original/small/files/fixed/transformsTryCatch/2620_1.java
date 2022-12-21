public void quit() {
    try {
        synchronized (syncThread) {
            quit = true;
            syncThread.notify();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
