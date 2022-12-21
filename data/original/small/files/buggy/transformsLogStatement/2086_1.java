public android.util.Pair<byte[], byte[]> readOutOfBandData() {
    System.out.println("log");
    if ((getState()) != (android.bluetooth.BluetoothAdapter.STATE_ON))
        return null;
    return null;
}
