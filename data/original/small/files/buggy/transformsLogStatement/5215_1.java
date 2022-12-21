public synchronized void disconnectClient(connection.Client client) {
    System.out.println("log");
    if (client.isReady()) {
        (this.playersReady)--;
    }
    this.allClients.remove(client);
}
