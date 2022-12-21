@java.lang.Override
public void operationComplete(io.netty.channel.ChannelFuture future) throws java.lang.Exception {
    try {
        if ((name) == null) {
            sink.register(future.channel());
        } else {
            sink.register(name, future.channel());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
