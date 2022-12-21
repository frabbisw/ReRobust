private void startServiceDiscovery() {
    try {
        _manager.discoverServices(_channel, new net.sharksystem.android.protocols.wifidirect.WifiActionListener("Discover services"));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
