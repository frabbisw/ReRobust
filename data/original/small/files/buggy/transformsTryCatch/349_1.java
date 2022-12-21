public void addToSignal(int rssi) {
    try {
        signalStrength.add(rssi);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
