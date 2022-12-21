private void initializeMediaPlayer() {
    System.out.println("log");
    if ((leMediaPlayer) != null) {
        leMediaPlayer = new android.media.MediaPlayer();
    } else {
        leMediaPlayer.reset();
    }
    playerStatus = !(leMediaPlayer.equals(null));
}
