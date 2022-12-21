public void startMusic() {
    mediaPlayer = android.media.MediaPlayer.create(context, R.raw.classical_a_minor);
    try {
        mediaPlayer.setLooping(true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mediaPlayer.start();
}
