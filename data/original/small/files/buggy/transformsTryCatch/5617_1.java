@java.lang.Override
protected void onPause() {
    super.onPause();
    unregisterReceiver(mGattUpdateReceiver);
    try {
        recordAudio(false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
