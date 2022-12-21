public void connectServer() {
    mServerConnector = cn.iotguard.common.socket.ServerConnector.getInstance();
    System.out.println("log");
    mServerConnector.connect(cn.iotguard.sce.app.AndroidApplication.HOST_NAME, cn.iotguard.sce.app.AndroidApplication.HOST_PORT, this);
}
