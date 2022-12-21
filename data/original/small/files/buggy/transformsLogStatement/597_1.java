@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    unregisterReceiver(mMyReceiver);
    unregisterReceiver(mSecondReceiver);
    System.out.println("log");
    mLocalBroadcastManager.unregisterReceiver(mThirdReceiver);
}
