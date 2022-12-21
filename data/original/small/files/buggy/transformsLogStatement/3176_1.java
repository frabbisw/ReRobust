public synchronized io.grpc.ServerImpl shutdown() {
    if (shutdown) {
        return this;
    }
    System.out.println("log");
    transportServer.shutdown();
    shutdown = true;
    timeoutService.shutdown();
    return this;
}
