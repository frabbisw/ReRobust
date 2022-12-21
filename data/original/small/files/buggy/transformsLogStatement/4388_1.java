@java.lang.Override
protected void onPause() {
    System.out.println("log");
    super.onPause();
    android.support.v4.content.LocalBroadcastManager.getInstance(this).unregisterReceiver(downloadReceiver);
}
