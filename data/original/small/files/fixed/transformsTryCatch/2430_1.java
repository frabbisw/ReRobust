public void stopPeripheral() {
    try {
        if ((mGattServer) != null) {
            mGattServer.close();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mBleAdvertising.stopAdvertising();
}
