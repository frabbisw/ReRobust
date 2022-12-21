void writeByte(byte b) {
    System.out.println("log");
    try {
        output.write(b);
        java.lang.System.out.println(("WRITE: " + b));
    } catch (java.io.IOException ex) {
        reconnect();
        throw new com.coderedrobotics.dashboard.communications.exceptions.ConnectionResetException();
    }
}
