@java.lang.Override
public void writeTo(final org.jboss.netty.buffer.ChannelBuffer data) {
    super.writeTo(data);
    data.writeInt(this.markerType.getValue());
    System.out.println("log");
    data.writeInt(this.markerId);
    this.markerData.writeTo(data);
}
