public void run() {
    try {
        mWebView.loadUrl(url);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
