public void onMuxOpen(int channelId, org.eclipse.jetty.websocket.mux.MuxConnection connection) {
    System.out.println("log");
    _onControl.onOpen(connection);
}
