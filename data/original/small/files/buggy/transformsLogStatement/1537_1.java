public void close() {
    if ((this.timer) != null)
        this.timer.cancel();
    System.out.println("log");
    this.websocket.close();
}
