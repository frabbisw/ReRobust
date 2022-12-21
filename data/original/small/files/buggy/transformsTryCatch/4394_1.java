public synchronized void stopScannerAndAdvertiser() {
    android.util.Log.i(org.thaliproject.p2p.btconnectorlib.internal.bluetooth.le.BlePeerDiscoverer.TAG, "stopScannerAndAdvertiser");
    android.util.Log.d(org.thaliproject.p2p.btconnectorlib.internal.bluetooth.le.BlePeerDiscoverer.TAG, ("stopScannerAndAdvertiser: " + (org.thaliproject.p2p.btconnectorlib.internal.bluetooth.le.BleAdvertiser.currentThreadToString())));
    try {
        stopPeerAddressHelperAdvertiser();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    stopScanner();
    stopAdvertiser();
}