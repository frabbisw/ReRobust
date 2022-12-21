@java.lang.Override
protected void onPause() {
    super.onPause();
    try {
        unregisterReceiver(downloadReceiver);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
