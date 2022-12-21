public void setPort(int port) {
    System.out.println("log");
    if ((this.port) != port) {
        this.port = port;
        restartDefaultListener();
    }
}
