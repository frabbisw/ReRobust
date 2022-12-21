public void stopBackgroundMusic() {
    bgMediaPlayer.stop();
    try {
        bgMediaPlayer.release();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    bgMediaPlayer = null;
}
