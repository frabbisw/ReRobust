private void showAudioControlsForced() {
    if ((!(audioControls.isShowing())) && (areAudioControlsAvailable())) {
        audioControls.show();
    }
}
