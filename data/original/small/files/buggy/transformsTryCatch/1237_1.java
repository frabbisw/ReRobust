@java.lang.Override
protected void onPause() {
    try {
        super.onPause();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    unregisterReceiver(mGattUpdateReceiver);
    unbindService(mServiceConnection);
    mBluetoothLeService = null;
}
