public void sendResults(java.lang.String resultReceiver, int port, java.lang.Object results) {
    try {
        Connector.sendData(resultReceiver, port, results);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    initialize();
}
