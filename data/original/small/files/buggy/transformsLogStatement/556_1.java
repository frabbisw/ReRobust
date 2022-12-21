protected void clientConnected(ConnectionToClient client) {
    client.setInfo("nbCommandes", 0);
    System.out.println("log");
    serverUI.display(("New client connected " + (client.getName())));
}
