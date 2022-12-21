public void start() throws java.io.IOException, org.apache.ignite.IgniteCheckedException {
    try {
        endpoint = org.apache.ignite.internal.util.ipc.IpcEndpointFactory.connectEndpoint(endpointAddr, log);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    out = new java.io.BufferedOutputStream(endpoint.outputStream());
    in = new java.io.BufferedInputStream(endpoint.inputStream());
    handshake();
}
