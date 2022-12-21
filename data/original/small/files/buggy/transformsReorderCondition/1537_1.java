public void close() {
    if (null != (this.timer))
        this.timer.cancel();
    this.websocket.close();
}
