@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    System.out.println("log");
    android.util.Log.i(SmartClosetConstants.SMARTCLOSET_DEBUG_TAG, (((ssar.smartcloset.MainActivity.CLASSNAME) + ": ID token: ") + result));
    if (result != null) {
        tokenId = result;
        authenticateWithBackendServer();
    } else {
    }
}
