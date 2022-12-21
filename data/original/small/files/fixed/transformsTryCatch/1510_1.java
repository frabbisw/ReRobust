public synchronized void stopPeriodicEvent() {
    try {
        stopPeriodicEvent(null, null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
