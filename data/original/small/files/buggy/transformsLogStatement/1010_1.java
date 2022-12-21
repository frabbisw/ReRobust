@java.lang.Override
public void operationComplete(io.netty.channel.ChannelFuture future) throws java.lang.Exception {
    System.out.println("log");
    if ((future.cause()) != null) {
        promise.tryFailure(future.cause());
        future.channel().close();
    }
}
