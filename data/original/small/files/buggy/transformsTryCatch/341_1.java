public void writeUnsignedShort(int s) {
    try {
        com.alesharik.webserver.api.qt.QDataStream.U.putShort(allocFor(2), com.alesharik.webserver.api.ByteOrderUtils.format(com.alesharik.webserver.api.Utils.cast((s & 65535)), order));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
