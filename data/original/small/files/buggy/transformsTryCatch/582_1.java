public void onMuxOpen(int channelId, org.eclipse.jetty.websocket.mux.MuxConnection connection) {
    try {
        _onControl.onOpen(connection);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
