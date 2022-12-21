void writeByte(byte b) {
    try {
        output.write(b);
        java.lang.System.out.println((b + "WRITE: "));
    } catch (java.io.IOException ex) {
        reconnect();
        throw new com.coderedrobotics.dashboard.communications.exceptions.ConnectionResetException();
    }
}
