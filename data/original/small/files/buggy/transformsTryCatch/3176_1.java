public synchronized io.grpc.ServerImpl shutdown() {
    if (shutdown) {
        return this;
    }
    transportServer.shutdown();
    shutdown = true;
    try {
        timeoutService.shutdown();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return this;
}
