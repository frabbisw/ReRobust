@java.lang.Override
public void handle(javafx.event.ActionEvent event) {
    System.out.println("log");
    openNewScenarioWindow(tvScenarios.getSelectionModel().getSelectedItem());
}
