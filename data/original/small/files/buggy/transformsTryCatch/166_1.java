@java.lang.Override
public void run() {
    try {
        if ((Build.VERSION.SDK_INT) < 21) {
        } else {
            mLEScanner.stopScan(mScanCallback);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
