public void connectServer() {
    try {
        mServerConnector = cn.iotguard.common.socket.ServerConnector.getInstance();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mServerConnector.connect(cn.iotguard.sce.app.AndroidApplication.HOST_NAME, cn.iotguard.sce.app.AndroidApplication.HOST_PORT, this);
}
