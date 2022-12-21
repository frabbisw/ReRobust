@java.lang.Override
public void readDescPacket(io.netty.buffer.ByteBuf buf) {
    super.readDescPacket(buf);
    try {
        processTime = buf.readInt();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
