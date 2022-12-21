public void stopPeripheral() {
    try {
        if ((mGattServer) != null) {
            disconnectFromDevices();
            mGattServer.close();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mBleAdvertising.stopAdvertising();
}
