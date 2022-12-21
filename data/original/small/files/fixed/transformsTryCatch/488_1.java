@com.tuanpm.RCTMqtt.ReactMethod
public void disconnect(final int clientRef) {
    try {
        if ((clients.get(clientRef)) != null) {
            clients.get(clientRef).disconnect();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
