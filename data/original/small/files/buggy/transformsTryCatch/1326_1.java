public void run() {
    try {
        mWebView.loadUrl(("javascript:" + js));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
