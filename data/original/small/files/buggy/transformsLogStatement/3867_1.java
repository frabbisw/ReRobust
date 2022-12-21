@java.lang.Override
protected android.webkit.WebView createViewInstance(com.facebook.react.uimanager.ThemedReactContext reactContext) {
    System.out.println("log");
    webView = reactContext;
    enableFileUpload(webView);
    return webView;
}
