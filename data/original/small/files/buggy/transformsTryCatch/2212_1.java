public void sendMessage(java.lang.String message) {
    try {
        _ws.send(message);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
