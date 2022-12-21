public byte[] asBytes() throws java.io.IOException {
    try {
        responseAsBytes = response.body().bytes();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((responseAsBytes) == null) {
        consume();
    }
    return responseAsBytes;
}
