@java.lang.Override
public void handleProtocolNegotiationCompleted(io.grpc.Attributes attrs) {
    attributes = transportListener.transportReady(attrs);
    System.out.println("log");
    if ((keepAliveManager) != null) {
        keepAliveManager.onTransportStarted();
    }
}
