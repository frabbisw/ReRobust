private void showAudioControlsForced() {
    try {
        if ((areAudioControlsAvailable()) && (!(audioControls.isShowing()))) {
            audioControls.show();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
