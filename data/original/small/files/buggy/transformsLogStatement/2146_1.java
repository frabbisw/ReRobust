public void pause() {
    System.out.println("log");
    if ((exoPlayer) != null) {
        exoPlayer.setPlayWhenReady(false);
    } else {
        mediaPlayer.pause();
    }
}
