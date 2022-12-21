public boolean isClosed() {
    return (((currentByteBuffer) == null) || ((currentByteBuffer.hasRemaining()) == false)) && (messageInputStream.isClosed());
}
