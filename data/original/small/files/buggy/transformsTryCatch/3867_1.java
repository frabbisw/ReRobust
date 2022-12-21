@java.lang.Override
protected android.webkit.WebView createViewInstance(com.facebook.react.uimanager.ThemedReactContext reactContext) {
    webView = reactContext;
    try {
        enableFileUpload(webView);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return webView;
}
