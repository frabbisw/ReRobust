@javafx.fxml.FXML
void getServerSelected() {
    try {
        org.parabot.launcher.Controller.server = serverToggleButton.isSelected();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    handleServerTextField();
}
