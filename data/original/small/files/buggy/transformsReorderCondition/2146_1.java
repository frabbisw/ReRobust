public void pause() {
    if (null != (exoPlayer)) {
        exoPlayer.setPlayWhenReady(false);
    } else {
        mediaPlayer.pause();
    }
}
