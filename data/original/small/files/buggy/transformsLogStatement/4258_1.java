public void sendResults(java.lang.String resultReceiver, int port, java.lang.Object results) {
    Connector.sendData(resultReceiver, port, results);
    System.out.println("log");
    initialize();
}
