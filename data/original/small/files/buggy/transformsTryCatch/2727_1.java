@java.lang.Override
public boolean onOverrideUrlLoading(java.lang.String url) {
    mPluginLayout.isSuspended = true;
    try {
        this.activity.runOnUiThread(new java.lang.Runnable() {

            @java.lang.Override
            public void run() {
                webView.loadUrl("javascript:if(window.cordova){cordova.fireDocumentEvent('plugin_url_changed', {});}");
            }
        });
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    plugin.google.maps.CordovaGoogleMaps.CURRENT_URL = url;
    return false;
}
