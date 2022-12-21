public void start() {
    System.out.println("log");
    if ((exoPlayer) != null) {
        exoPlayer.setPlayWhenReady(true);
    } else {
        mediaPlayer.start();
    }
}
