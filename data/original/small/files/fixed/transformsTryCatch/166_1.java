@java.lang.Override
public void run() {
    try {
        mLEScanner.stopScan(mScanCallback);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
