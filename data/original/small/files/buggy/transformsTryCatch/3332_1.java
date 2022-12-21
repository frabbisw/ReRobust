@javafx.fxml.FXML
void setServerName() {
    try {
        org.parabot.launcher.Controller.serverName = serverTextField.getText();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
