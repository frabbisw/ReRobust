public boolean bluetoothStateOn(android.content.Intent intent) {
    int newState = mBluetoothAdapter.getState();
    try {
        if (newState == (android.bluetooth.BluetoothAdapter.STATE_ON)) {
            progress.dismiss();
            currentContext.unregisterReceiver(fragmentBr);
            return true;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
