private void startReadRequest() {
    try {
        android.util.Log.i(net.fishandwhistle.openpos.BarcodeReaderActivity.TAG, ("Launching read request " + (currentReadRequest)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    currentReadRequest = java.lang.System.currentTimeMillis();
    enableScanning = true;
}
