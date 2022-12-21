@java.lang.Override
public void onReceivedError(android.webkit.WebView view, int errorCode, java.lang.String description, java.lang.String failingUrl) {
    didReceiveError = true;
    pageIsLoaded = false;
    try {
        ViewPagerDownloadManager.instance.done(this, false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    showErrorMessage(R.string.network_error_message, FontAwesomeIcons.fa_exclamation_circle);
}
