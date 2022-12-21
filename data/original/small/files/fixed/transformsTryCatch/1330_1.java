public void show() {
    seedu.geekeep.ui.HelpWindow.logger.fine("Showing help page about the application.");
    try {
        dialogStage.show();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
