public void close() {
    stopBgTask();
    try {
        xmlsocket.close();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    xmlsocket = null;
}
