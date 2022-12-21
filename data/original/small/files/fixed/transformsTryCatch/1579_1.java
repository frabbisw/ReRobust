public void stopBackgroundMusic() {
    try {
        if ((bgMediaPlayer) != null) {
            bgMediaPlayer.stop();
            bgMediaPlayer.release();
            bgMediaPlayer = null;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
