@java.lang.Override
public void initialize(org.apache.cordova.CordovaInterface cordova, org.apache.cordova.CordovaWebView webView) {
    try {
        super.initialize(cordova, webView);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.plugin.gcm.PushPlugin.gForeground = true;
    clearNotifs();
}
