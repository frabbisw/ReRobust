public synchronized void disconnectClient(connection.Client client) {
    try {
        if (client.isReady()) {
            (this.playersReady)--;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.allClients.remove(client);
}
