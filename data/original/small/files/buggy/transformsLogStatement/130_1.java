private void setWebSocket(com.koushikdutta.async.http.WebSocket webSocket) {
    System.out.println("log");
    this.webSocket = webSocket;
    this.webSocket.setStringCallback(getStringCallback());
    subscribeStates();
    if (!(initialized)) {
        getStates();
    }
}
