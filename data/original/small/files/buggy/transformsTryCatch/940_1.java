private void newPipeRequested(java.nio.channels.AsynchronousSocketChannel majorSocket) {
    mini.relay.Pipe newPipe = new mini.relay.Pipe();
    newPipe.setMajor(majorSocket);
    newPipe.setMajorReady();
    this.initiateInboundSocket(newPipe);
    try {
        this.initiateOutboundSocket(newPipe);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
