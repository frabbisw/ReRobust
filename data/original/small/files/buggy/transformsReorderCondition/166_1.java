@java.lang.Override
public void run() {
    if (21 > (Build.VERSION.SDK_INT)) {
    } else {
        mLEScanner.stopScan(mScanCallback);
    }
}
