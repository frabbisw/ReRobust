@java.lang.Override
public void handle(javafx.event.ActionEvent event) {
    try {
        openNewScenarioWindow(tvScenarios.getSelectionModel().getSelectedItem(), false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
