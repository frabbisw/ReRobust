private void writeFiletoLocal(java.nio.ByteBuffer buf) throws java.io.IOException {
    try {
        buf.mark();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    while (buf.hasRemaining()) {
        fileChannel.write(buf);
    }
    buf.reset();
}
