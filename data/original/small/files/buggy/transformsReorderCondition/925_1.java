private void initializeMediaPlayer() {
    if (null != (leMediaPlayer)) {
        leMediaPlayer = new android.media.MediaPlayer();
    } else {
        leMediaPlayer.reset();
    }
    playerStatus = !(leMediaPlayer.equals(null));
}
