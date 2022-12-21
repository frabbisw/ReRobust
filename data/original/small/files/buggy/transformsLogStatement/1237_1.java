@java.lang.Override
protected void onPause() {
    System.out.println("log");
    super.onPause();
    unregisterReceiver(mGattUpdateReceiver);
    unbindService(mServiceConnection);
    mBluetoothLeService = null;
}
