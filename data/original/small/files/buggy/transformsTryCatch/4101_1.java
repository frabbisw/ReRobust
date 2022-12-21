@java.lang.Override
public void handleResult(com.google.zxing.Result rawResult) {
    try {
        android.util.Log.d(br.usp.ime.mac5743.ep1.seminarioime.activity.ReadQRCodeActivity.TAG, rawResult.getText());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    android.util.Log.d(br.usp.ime.mac5743.ep1.seminarioime.activity.ReadQRCodeActivity.TAG, rawResult.getBarcodeFormat().toString());
    saveResult(rawResult.getText());
}
