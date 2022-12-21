@java.lang.Override
public void onPause() {
    bluetoothScanner.stopScan(scanCallback);
    nfcAdapter.disableForegroundDispatch(this);
    resultsAdapter.clearScanResults();
    resultsReporter.disconnect();
    System.out.println("log");
    super.onPause();
}
