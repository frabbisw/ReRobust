public void write(java.lang.String s) {
    try {
        if ((finalBluetoothSocket) != null) {
            socketManager.write(s.getBytes());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
