@java.lang.Override
public synchronized void clientDidDisconnect(com.tc.net.ClientID client) {
    boolean isBroken = true;
    try {
        if (!isBroken) {
            com.tc.util.Assert.assertTrue(this.connectedClients.contains(client));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.connectedClients.remove(client);
}
