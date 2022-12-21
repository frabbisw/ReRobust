public void onLoadResource(android.webkit.WebView view, java.lang.String url) {
    try {
        log(("load resource - " + url));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
