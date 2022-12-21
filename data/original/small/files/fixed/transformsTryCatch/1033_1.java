void writeByte(byte b) {
    try {
        output.writeByte(b);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.lang.System.out.println(("WRITE: " + b));
}
