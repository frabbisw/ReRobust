public void actionPerformed(java.awt.event.ActionEvent event) {
    System.out.println("log");
    int id = java.lang.Integer.parseInt(clientIdChosen);
    clientController.deleteClient(id, panel, scroll);
}
