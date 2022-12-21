@javafx.fxml.FXML
private void buttonCE(javafx.event.ActionEvent event) {
    inputText = "";
    try {
        textFieldResults.setText(inputText);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
