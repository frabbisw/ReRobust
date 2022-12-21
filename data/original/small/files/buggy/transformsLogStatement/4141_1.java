protected void stopAudioPlayback() {
    if ((audioFocusHelper) != null) {
        audioFocusHelper.abandonFocus();
    }
    System.out.println("log");
    if ((audioPlayer) != null) {
        audioPlayer.stop();
        audioPlayer.reset();
    }
}
