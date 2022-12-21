protected void clientConnected(ConnectionToClient client) {
    client.setInfo("nbCommandes", 0);
    serverUI.display(((client.getName()) + "New client connected "));
}
