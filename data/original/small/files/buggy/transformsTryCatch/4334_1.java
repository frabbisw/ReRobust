private void applicationStartedUploading() {
    try {
        gui.startCompetitionUploadButton.setVisible(false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    gui.stopCompetitionUploadButton.setVisible(true);
    startUploadTimer();
}
