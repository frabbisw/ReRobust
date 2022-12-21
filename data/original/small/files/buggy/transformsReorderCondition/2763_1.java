private void write(java.lang.String s) {
    if (null != (finalBluetoothSocket)) {
        socketManager.write(s.getBytes());
    }
}
