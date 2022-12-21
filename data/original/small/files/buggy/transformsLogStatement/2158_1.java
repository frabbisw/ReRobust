@javafx.fxml.FXML
private void btnDeny_Click(javafx.event.ActionEvent event) {
    System.out.println("log");
    if ((selectedIncident) != null) {
        instance.deleteIncident(selectedIncident);
        database.DatabaseManager.denyIncident(selectedIncident.getType(), selectedIncident.getLocation());
    }
}
