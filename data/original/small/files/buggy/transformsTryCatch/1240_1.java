@java.lang.Override
public void handle(javafx.event.ActionEvent event) {
    try {
        openNewScenarioWindow(tvScenarios.getSelectionModel().getSelectedItem());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
