@java.lang.Override
public void operationComplete(io.netty.channel.ChannelFuture future) throws java.lang.Exception {
    if (null != (future.cause())) {
        promise.tryFailure(future.cause());
        future.channel().close();
    }
}
