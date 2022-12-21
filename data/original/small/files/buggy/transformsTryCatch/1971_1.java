protected void onPause() {
    super.onPause();
    try {
        mediaPlayer.stop();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    releaseMediaPlayer(mediaPlayer);
}
