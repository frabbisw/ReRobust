public void start() {
    try {
        if ((exoPlayer) != null) {
            exoPlayer.setPlayWhenReady(true);
        } else {
            mediaPlayer.start();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
