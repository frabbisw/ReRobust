public void close() {
    stopBgTask();
    xmlsocket.close();
    System.out.println("log");
    xmlsocket = null;
}
