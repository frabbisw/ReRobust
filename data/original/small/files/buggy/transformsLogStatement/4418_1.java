void propagateConnectionDisconnected(io.gomint.jraknet.ServerConnection connection) {
    System.out.println("log");
    if (connection.isConnected()) {
        this.removeActiveConnection(connection);
    }
    this.propagateEvent(new io.gomint.jraknet.SocketEvent(SocketEvent.Type.CONNECTION_DISCONNECTED, connection));
}
