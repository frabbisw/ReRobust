void propagateConnectionDisconnected(io.gomint.jraknet.ServerConnection connection) {
    try {
        if (connection.isConnected()) {
            this.removeActiveConnection(connection);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.propagateEvent(new io.gomint.jraknet.SocketEvent(SocketEvent.Type.CONNECTION_DISCONNECTED, connection));
}
