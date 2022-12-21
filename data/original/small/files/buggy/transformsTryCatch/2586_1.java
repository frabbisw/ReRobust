public void onPrepared(android.media.MediaPlayer mediaPlayer) {
    showHud();
    try {
        videoView.start();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
