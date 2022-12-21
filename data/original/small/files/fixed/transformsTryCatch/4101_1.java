@java.lang.Override
public void handleResult(com.google.zxing.Result rawResult) {
    try {
        saveResult(rawResult.getText());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
