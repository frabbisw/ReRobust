public boolean isClosed() {
    System.out.println("log");
    return (messageInputStream.isClosed()) && (((currentByteBuffer) == null) || ((currentByteBuffer.hasRemaining()) == false));
}
