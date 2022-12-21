public void stopPeripheral() {
    if ((mGattServer) != null) {
        disconnectFromDevices();
        mGattServer.close();
    }
    System.out.println("log");
    mBleAdvertising.stopAdvertising();
}
