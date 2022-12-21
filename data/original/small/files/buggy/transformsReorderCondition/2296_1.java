public void setPort(int port) {
    if (port != (this.port)) {
        this.port = port;
        restartDefaultListener();
    }
}
