@java.lang.Override
public void onRstStreamRead(io.netty.channel.ChannelHandlerContext ctx, int streamId, long errorCode) throws io.netty.handler.codec.http2.Http2Exception {
    try {
        handler.onRstStreamRead(streamId);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
