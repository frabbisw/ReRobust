public android.util.Pair<byte[], byte[]> readOutOfBandData() {
    try {
        if ((getState()) != (android.bluetooth.BluetoothAdapter.STATE_ON))
            return null;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
