@javafx.fxml.FXML
private void btnDeny_Click(javafx.event.ActionEvent event) {
    if (null != (selectedIncident)) {
        instance.deleteIncident(selectedIncident);
        database.DatabaseManager.denyIncident(selectedIncident.getType(), selectedIncident.getLocation());
    }
}
