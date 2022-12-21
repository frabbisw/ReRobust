@java.lang.Override
public synchronized void reset() throws java.io.IOException {
    byteBuf[0] = byteBufSave[0];
    byteBuf[1] = byteBufSave[0];
    unusedBytes = unusedBytesSave;
    try {
        super.reset();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
