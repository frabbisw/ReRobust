@com.tuanpm.RCTMqtt.ReactMethod
public void disconnect(final int clientRef) {
    System.out.println("log");
    clients.get(clientRef).disconnect();
}
