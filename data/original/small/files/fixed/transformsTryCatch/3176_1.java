public synchronized io.grpc.ServerImpl shutdown() {
    if (shutdown) {
        return this;
    }
    shutdown = true;
    try {
        transportServer.shutdown();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    timeoutService.shutdown();
    return this;
}
