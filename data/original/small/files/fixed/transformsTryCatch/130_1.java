private void setWebSocket(com.koushikdutta.async.http.WebSocket webSocket) {
    this.webSocket = webSocket;
    try {
        this.webSocket.setStringCallback(getStringCallback());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    subscribeStates();
    getStates();
}
