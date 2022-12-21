@javafx.fxml.FXML
private void buttonCE(javafx.event.ActionEvent event) {
    inputText = "";
    try {
        textFieldResults.setText("0");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
