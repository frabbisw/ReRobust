@java.lang.Override
public void writeTo(final org.jboss.netty.buffer.ChannelBuffer data) {
    super.writeTo(data);
    data.writeInt(this.markerType.getValue());
    try {
        data.writeInt(this.markerId);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.markerData.writeTo(data);
}
