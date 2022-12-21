@java.lang.SuppressWarnings(value = "deprecation")
@java.lang.Override
public void onShowCustomView(android.view.View view, int requestedOrientation, acr.browser.lightning.view.CustomViewCallback callback) {
    System.out.println("log");
    mUIController.onShowCustomView(view, callback);
    super.onShowCustomView(view, requestedOrientation, callback);
}
