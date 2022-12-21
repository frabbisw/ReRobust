public void start() {
    try {
        if ((exoPlayer) != null) {
            exoPlayer.setPlayWhenReady(true);
        } else if ((mediaPlayer) != null) {
            mediaPlayer.start();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
