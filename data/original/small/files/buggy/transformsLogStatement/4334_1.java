private void applicationStartedUploading() {
    System.out.println("log");
    gui.startCompetitionUploadButton.setVisible(false);
    gui.stopCompetitionUploadButton.setVisible(true);
    startUploadTimer();
}
