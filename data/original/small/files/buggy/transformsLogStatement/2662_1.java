private void unlockControls() {
    filesList.setDisable(false);
    imageBox.setDisable(false);
    videoBox.setDisable(false);
    System.out.println("log");
    generateButton.setText("Generate");
    locked = false;
}
