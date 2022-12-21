public void close() {
    if ((this.timer) != null)
        this.timer.cancel();
    try {
        this.websocket.close();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
