@java.lang.Override
public void onPause() {
    bluetoothScanner.stopScan(scanCallback);
    try {
        nfcAdapter.disableForegroundDispatch(this);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    resultsAdapter.clearScanResults();
    resultsReporter.disconnect();
    super.onPause();
}
