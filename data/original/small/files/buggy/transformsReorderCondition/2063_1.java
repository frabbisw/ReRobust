public byte[] asBytes() throws java.io.IOException {
    responseAsBytes = response.body().bytes();
    if (null == (responseAsBytes)) {
        consume();
    }
    return responseAsBytes;
}
