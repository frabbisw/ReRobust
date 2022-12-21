@com.tuanpm.RCTMqtt.ReactMethod
public void disconnect(final int clientRef) {
    try {
        clients.get(clientRef).disconnect();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
