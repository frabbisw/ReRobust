@java.lang.Override
public xingu.node.commons.signal.impl.BooleanSignal perform(xingu.node.commons.signal.impl.ExceptionSignal signal, org.jboss.netty.channel.Channel channel) throws java.lang.Exception {
    java.lang.System.err.println(("Error Executing Signal " + (this.signal)));
    try {
        java.lang.System.err.println(trace);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
