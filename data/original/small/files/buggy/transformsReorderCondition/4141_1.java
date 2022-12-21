protected void stopAudioPlayback() {
    if (null != (audioFocusHelper)) {
        audioFocusHelper.abandonFocus();
    }
    if ((audioPlayer) != null) {
        audioPlayer.stop();
        audioPlayer.reset();
    }
}
