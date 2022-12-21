public void run() {
    if ((mWebView) == null) {
        return;
    }
    try {
        mWebView.loadUrl(("javascript:" + js));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
