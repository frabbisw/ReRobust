void propagateConnectionDisconnected(io.gomint.jraknet.ServerConnection connection) {
    this.removeActiveConnection(connection);
    try {
        this.propagateEvent(new io.gomint.jraknet.SocketEvent(SocketEvent.Type.CONNECTION_DISCONNECTED, connection));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
