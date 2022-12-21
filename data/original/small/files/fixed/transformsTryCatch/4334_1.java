private void applicationStartedUploading() {
    gui.startCompetitionUploadButton.setEnabled(false);
    gui.stopCompetitionUploadButton.setEnabled(true);
    try {
        startUploadTimer();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
