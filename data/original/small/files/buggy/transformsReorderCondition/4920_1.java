@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    android.util.Log.i(SmartClosetConstants.SMARTCLOSET_DEBUG_TAG, (result + ((ssar.smartcloset.MainActivity.CLASSNAME) + ": ID token: ")));
    if (result != null) {
        tokenId = result;
        authenticateWithBackendServer();
    } else {
    }
}
