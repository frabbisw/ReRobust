private void initializeMediaPlayer() {
    try {
        if ((leMediaPlayer) != null) {
            leMediaPlayer = new android.media.MediaPlayer();
        } else {
            leMediaPlayer.reset();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    playerStatus = !(leMediaPlayer.equals(null));
}
