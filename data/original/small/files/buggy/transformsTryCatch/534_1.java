@java.lang.Override
public void handleProtocolNegotiationCompleted(io.grpc.Attributes attrs) {
    try {
        attributes = transportListener.transportReady(attrs);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((keepAliveManager) != null) {
        keepAliveManager.onTransportStarted();
    }
}
