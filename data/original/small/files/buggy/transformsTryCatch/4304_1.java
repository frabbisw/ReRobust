public byte[] getSubnegotiation() {
    byte[] subnegotiation = new byte[this.subnegotiation.length];
    try {
        java.lang.System.arraycopy(this.subnegotiation, 0, subnegotiation, 0, subnegotiation.length);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return subnegotiation;
}
