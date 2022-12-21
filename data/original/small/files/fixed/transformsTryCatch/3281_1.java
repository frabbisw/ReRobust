@java.lang.Override
public void channelActive(io.netty.channel.ChannelHandlerContext ctx) throws java.lang.Exception {
    ctx.pipeline().remove(this);
    try {
        ctx.fireChannelActive();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
