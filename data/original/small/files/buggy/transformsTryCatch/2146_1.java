public void pause() {
    try {
        if ((exoPlayer) != null) {
            exoPlayer.setPlayWhenReady(false);
        } else {
            mediaPlayer.pause();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
