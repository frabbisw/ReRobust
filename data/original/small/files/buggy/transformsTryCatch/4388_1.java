@java.lang.Override
protected void onPause() {
    super.onPause();
    try {
        android.support.v4.content.LocalBroadcastManager.getInstance(this).unregisterReceiver(downloadReceiver);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
