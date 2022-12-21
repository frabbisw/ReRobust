@java.lang.Override
@net.openhft.chronicle.core.annotation.ForceInline
public net.openhft.chronicle.bytes.Bytes<Underlying> writeSkip(long bytesToSkip) throws java.nio.BufferOverflowException, net.openhft.chronicle.core.io.IORuntimeException {
    try {
        writeCheckOffset(writePosition, bytesToSkip);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return this;
}
