public void pause() {
    try {
        if ((exoPlayer) != null) {
            exoPlayer.setPlayWhenReady(false);
        } else if ((mediaPlayer) != null) {
            mediaPlayer.pause();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
