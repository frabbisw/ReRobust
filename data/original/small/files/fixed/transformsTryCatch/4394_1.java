public synchronized void stopScannerAndAdvertiser() {
    android.util.Log.d(org.thaliproject.p2p.btconnectorlib.internal.bluetooth.le.BlePeerDiscoverer.TAG, ("stopScannerAndAdvertiser: " + (org.thaliproject.p2p.btconnectorlib.internal.bluetooth.le.BleAdvertiser.currentThreadToString())));
    stopPeerAddressHelperAdvertiser();
    stopScanner();
    try {
        stopAdvertiser();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
