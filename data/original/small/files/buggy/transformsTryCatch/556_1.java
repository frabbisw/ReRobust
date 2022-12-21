protected void clientConnected(ConnectionToClient client) {
    client.setInfo("nbCommandes", 0);
    try {
        serverUI.display(("New client connected " + (client.getName())));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
