public byte[] asBytes() throws java.io.IOException {
    responseAsBytes = response.body().bytes();
    if ((responseAsBytes) == null) {
        consume();
    }
    System.out.println("log");
    return responseAsBytes;
}
