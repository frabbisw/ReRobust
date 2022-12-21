@java.lang.Override
public void run() {
    System.out.println("log");
    if ((Build.VERSION.SDK_INT) < 21) {
    } else {
        mLEScanner.stopScan(mScanCallback);
    }
}
