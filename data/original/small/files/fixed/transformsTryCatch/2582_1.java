@java.lang.Override
public synchronized void clientDidDisconnect(com.tc.net.ClientID client) {
    com.tc.util.Assert.assertTrue(this.connectedClients.contains(client));
    try {
        this.connectedClients.remove(client);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
