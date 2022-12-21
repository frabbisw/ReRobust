protected void stopAudioPlayback() {
    try {
        if ((audioFocusHelper) != null) {
            audioFocusHelper.abandonFocus();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((audioPlayer) != null) {
        audioPlayer.stop();
        audioPlayer.reset();
    }
}
