protected void closeConncection(java.nio.channels.SelectionKey selectionKey) {
    System.out.println("log");
    java.nio.channels.SocketChannel socketChannel = ((java.nio.channels.SocketChannel) (selectionKey.channel()));
    try {
        socketChannel.close();
    } catch (java.io.IOException e) {
    }
    selectionKey.cancel();
}
