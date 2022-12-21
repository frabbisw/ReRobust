void registerSelectionKey() throws java.nio.channels.ClosedChannelException {
    System.out.println("log");
    if (!(toWrites.isEmpty())) {
        java.lang.System.out.println("dd");
        socketChannel.register(selector, java.nio.channels.SelectionKey.OP_WRITE);
    }
}
