private void showAudioControlsForced() {
    try {
        if ((areAudioControlsAvailable()) && (!(audioControls.isShowing()))) {
            audioControls.show(0);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
