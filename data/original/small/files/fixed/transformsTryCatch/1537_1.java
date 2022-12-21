public void close() {
    if ((this.timer) != null)
        this.timer.cancel();
    try {
        if ((this.websocket) != null)
            this.websocket.close();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
