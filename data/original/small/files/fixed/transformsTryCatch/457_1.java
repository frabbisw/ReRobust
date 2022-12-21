public void startMusic() {
    try {
        mediaPlayer.setLooping(true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mediaPlayer.start();
}
