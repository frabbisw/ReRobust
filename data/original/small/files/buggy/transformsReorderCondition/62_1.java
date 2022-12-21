public boolean bluetoothStateOn(android.content.Intent intent) {
    int newState = mBluetoothAdapter.getState();
    if ((android.bluetooth.BluetoothAdapter.STATE_ON) == newState) {
        progress.dismiss();
        currentContext.unregisterReceiver(fragmentBr);
        return true;
    }
    return false;
}
