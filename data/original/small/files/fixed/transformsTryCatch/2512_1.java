@java.lang.Override
public void operationComplete(io.netty.channel.ChannelFuture future) throws java.lang.Exception {
    try {
        if (future.isSuccess()) {
            ctx.channel().read();
        } else {
            future.channel().close();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
