@java.lang.Override
public void operationComplete(io.netty.channel.ChannelFuture future) throws java.lang.Exception {
    try {
        sink.register(future.channel());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
