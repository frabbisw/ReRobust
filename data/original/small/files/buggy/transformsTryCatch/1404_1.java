@java.lang.SuppressWarnings(value = "deprecation")
@java.lang.Override
public void onShowCustomView(android.view.View view, int requestedOrientation, acr.browser.lightning.view.CustomViewCallback callback) {
    try {
        mUIController.onShowCustomView(view, callback);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    super.onShowCustomView(view, requestedOrientation, callback);
}
