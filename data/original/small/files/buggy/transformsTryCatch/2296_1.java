public void setPort(int port) {
    try {
        if ((this.port) != port) {
            this.port = port;
            restartDefaultListener();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
