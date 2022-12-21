protected void onPause() {
    try {
        releaseMediaPlayer(mediaPlayer);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    super.onPause();
}
