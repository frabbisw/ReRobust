public void stopPlayer() {
    try {
        audioPlayer.getMediaPlayer().release();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
