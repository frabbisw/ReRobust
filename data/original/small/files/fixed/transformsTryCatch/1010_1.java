@java.lang.Override
public void operationComplete(io.netty.channel.ChannelFuture future) throws java.lang.Exception {
    try {
        if ((future.cause()) != null) {
            future.channel().close();
            promise.tryFailure(future.cause());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
