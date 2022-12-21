@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    try {
        android.util.Log.i(SmartClosetConstants.SMARTCLOSET_DEBUG_TAG, (((ssar.smartcloset.MainActivity.CLASSNAME) + ": ID token: ") + result));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (result != null) {
        tokenId = result;
    } else {
    }
}
