@java.lang.Override
public void writeTo(final org.jboss.netty.buffer.ChannelBuffer data) {
    super.writeTo(data);
    try {
        data.writeInt(this.markerId);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    data.writeInt(this.markerType.getValue());
    this.markerData.writeTo(data);
}
