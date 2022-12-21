private java.lang.String publicKeyToString() {
    java.lang.StringBuffer buffer = new java.lang.StringBuffer();
    try {
        for (byte b : publicKey) {
            buffer.append(b);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return buffer.toString();
}
