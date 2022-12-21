public void show() {
    try {
        seedu.geekeep.ui.HelpWindow.logger.fine("Showing help page about the application.");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    dialogStage.showAndWait();
}
