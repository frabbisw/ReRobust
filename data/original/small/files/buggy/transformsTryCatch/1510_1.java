public synchronized void stopPeriodicEvent() {
    try {
        stopPeriodicEvent(null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
