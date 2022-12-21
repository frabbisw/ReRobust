public byte[] asBytes() throws java.io.IOException {
    try {
        if ((responseAsBytes) == null) {
            consume();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return responseAsBytes;
}
