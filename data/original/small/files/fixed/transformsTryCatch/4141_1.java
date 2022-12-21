protected void stopAudioPlayback() {
    try {
        if ((audioPlayer) != null) {
            audioPlayer.stop();
            audioPlayer.reset();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
