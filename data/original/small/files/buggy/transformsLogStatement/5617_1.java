@java.lang.Override
protected void onPause() {
    super.onPause();
    System.out.println("log");
    unregisterReceiver(mGattUpdateReceiver);
    recordAudio(false);
}
