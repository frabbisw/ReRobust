public void sendMessage(java.lang.String message) {
    try {
        if ((_ws) != null) {
            _ws.send(message);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
