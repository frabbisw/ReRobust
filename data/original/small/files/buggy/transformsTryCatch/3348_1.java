public void stopPlayer() {
    try {
        audioPlayer.getMediaPlayer().stop();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    audioPlayer.getMediaPlayer().release();
}
