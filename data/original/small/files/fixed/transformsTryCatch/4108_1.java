@java.lang.Override
public void onPause() {
    super.onPause();
    try {
        mScannerView.stopCamera();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
