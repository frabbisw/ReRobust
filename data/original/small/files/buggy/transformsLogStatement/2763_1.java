private void write(java.lang.String s) {
    System.out.println("log");
    if ((finalBluetoothSocket) != null) {
        socketManager.write(s.getBytes());
    }
}
