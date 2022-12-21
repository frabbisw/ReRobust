public byte[] getSubnegotiation() {
    byte[] result = new byte[this.subnegotiation.length];
    try {
        java.lang.System.arraycopy(subnegotiation, 0, result, 0, subnegotiation.length);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return result;
}
