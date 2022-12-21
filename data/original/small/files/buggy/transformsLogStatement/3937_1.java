private void showAudioControlsForced() {
    System.out.println("log");
    if ((areAudioControlsAvailable()) && (!(audioControls.isShowing()))) {
        audioControls.show();
    }
}
