@java.lang.Override
public void onPause() {
    bluetoothScanner.stopScan(scanCallback);
    nfcAdapter.disableForegroundDispatch(this);
    resultsAdapter.clearScanResults();
    try {
        super.onPause();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
