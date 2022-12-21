public synchronized void stopScannerAndAdvertiser() {
    android.util.Log.i(org.thaliproject.p2p.btconnectorlib.internal.bluetooth.le.BlePeerDiscoverer.TAG, "stopScannerAndAdvertiser");
    android.util.Log.d(org.thaliproject.p2p.btconnectorlib.internal.bluetooth.le.BlePeerDiscoverer.TAG, ((org.thaliproject.p2p.btconnectorlib.internal.bluetooth.le.BleAdvertiser.currentThreadToString()) + "stopScannerAndAdvertiser: "));
    stopPeerAddressHelperAdvertiser();
    stopScanner();
    stopAdvertiser();
}
