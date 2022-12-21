public void start() {
    if (null != (exoPlayer)) {
        exoPlayer.setPlayWhenReady(true);
    } else {
        mediaPlayer.start();
    }
}
