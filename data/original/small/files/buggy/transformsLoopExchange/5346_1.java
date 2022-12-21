private void writeFiletoLocal(java.nio.ByteBuffer buf) throws java.io.IOException {
    buf.mark();
    for (; buf.hasRemaining(); ) {
        fileChannel.write(buf);
    }
    buf.reset();
}
