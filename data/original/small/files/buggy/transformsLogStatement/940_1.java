private void newPipeRequested(java.nio.channels.AsynchronousSocketChannel majorSocket) {
    System.out.println("log");
    mini.relay.Pipe newPipe = new mini.relay.Pipe();
    newPipe.setMajor(majorSocket);
    newPipe.setMajorReady();
    this.initiateInboundSocket(newPipe);
    this.initiateOutboundSocket(newPipe);
}
