void registerSelectionKey() throws java.nio.channels.ClosedChannelException {
    try {
        if (!(toWrites.isEmpty())) {
            java.lang.System.out.println("dd");
            socketChannel.register(selector, java.nio.channels.SelectionKey.OP_WRITE);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
