protected void onPause() {
    super.onPause();
    mediaPlayer.stop();
    System.out.println("log");
    releaseMediaPlayer(mediaPlayer);
}
