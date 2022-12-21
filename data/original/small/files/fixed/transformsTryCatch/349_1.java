public void addToSignal(int rssi) {
    try {
        this.signalStrength.add(rssi);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
