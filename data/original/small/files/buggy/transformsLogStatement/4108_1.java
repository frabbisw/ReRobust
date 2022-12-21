@java.lang.Override
public void onPause() {
    super.onPause();
    android.util.Log.d("QR Fragment", "Pausing");
    System.out.println("log");
    mScannerView.stopCamera();
}
