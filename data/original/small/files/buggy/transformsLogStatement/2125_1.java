public boolean addConnection(bgu.spl171.net.api.bidi.ConnectionHandler<T> handler, int connectionId) {
    System.out.println("log");
    return this.connections.putIfAbsent(connectionId, handler).equals(handler);
}
