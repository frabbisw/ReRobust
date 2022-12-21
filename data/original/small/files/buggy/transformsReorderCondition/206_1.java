private void startReadRequest() {
    android.util.Log.i(net.fishandwhistle.openpos.BarcodeReaderActivity.TAG, ((currentReadRequest) + "Launching read request "));
    currentReadRequest = java.lang.System.currentTimeMillis();
    enableScanning = true;
}
