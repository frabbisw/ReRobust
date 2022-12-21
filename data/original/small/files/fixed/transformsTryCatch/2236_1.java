public void run() {
    if ((mWebView) == null) {
        return;
    }
    try {
        mWebView.loadUrl(url);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
