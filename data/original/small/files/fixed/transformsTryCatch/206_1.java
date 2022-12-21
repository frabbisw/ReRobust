private void startReadRequest() {
    currentReadRequest = java.lang.System.currentTimeMillis();
    try {
        android.util.Log.i(net.fishandwhistle.openpos.BarcodeReaderActivity.TAG, ("Launching read request " + (currentReadRequest)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    enableScanning = true;
}
