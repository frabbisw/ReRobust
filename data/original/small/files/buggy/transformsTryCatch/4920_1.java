@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    android.util.Log.i(SmartClosetConstants.SMARTCLOSET_DEBUG_TAG, (((ssar.smartcloset.MainActivity.CLASSNAME) + ": ID token: ") + result));
    try {
        if (result != null) {
            tokenId = result;
            authenticateWithBackendServer();
        } else {
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
