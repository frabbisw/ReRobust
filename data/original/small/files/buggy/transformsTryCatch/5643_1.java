public synchronized void shutdown() {
    isGone = false;
    try {
        notifyAll();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
