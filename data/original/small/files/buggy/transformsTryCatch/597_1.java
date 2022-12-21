@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    try {
        unregisterReceiver(mMyReceiver);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    unregisterReceiver(mSecondReceiver);
    mLocalBroadcastManager.unregisterReceiver(mThirdReceiver);
}
