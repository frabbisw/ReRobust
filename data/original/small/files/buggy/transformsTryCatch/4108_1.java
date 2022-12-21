@java.lang.Override
public void onPause() {
    super.onPause();
    android.util.Log.d("QR Fragment", "Pausing");
    try {
        mScannerView.stopCamera();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
