private void unlockControls() {
    filesList.setDisable(false);
    try {
        imageBox.setDisable(false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    videoBox.setDisable(false);
    generateButton.setText("Generate");
    locked = false;
}
