public synchronized void stopScannerAndAdvertiser() {
    android.util.Log.i(org.thaliproject.p2p.btconnectorlib.internal.bluetooth.le.BlePeerDiscoverer.TAG, "stopScannerAndAdvertiser");
    System.out.println("log");
    android.util.Log.d(org.thaliproject.p2p.btconnectorlib.internal.bluetooth.le.BlePeerDiscoverer.TAG, ("stopScannerAndAdvertiser: " + (org.thaliproject.p2p.btconnectorlib.internal.bluetooth.le.BleAdvertiser.currentThreadToString())));
    stopPeerAddressHelperAdvertiser();
    stopScanner();
    stopAdvertiser();
}
