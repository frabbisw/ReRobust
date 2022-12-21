public void stopPeripheral() {
    if (null != (mGattServer)) {
        disconnectFromDevices();
        mGattServer.close();
    }
    mBleAdvertising.stopAdvertising();
}
