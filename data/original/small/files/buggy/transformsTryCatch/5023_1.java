public void actionPerformed(java.awt.event.ActionEvent event) {
    int id = java.lang.Integer.parseInt(clientIdChosen);
    try {
        clientController.deleteClient(id, panel, scroll);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
