public void startMusic() {
    mediaPlayer = android.media.MediaPlayer.create(context, R.raw.classical_a_minor);
    System.out.println("log");
    mediaPlayer.setLooping(true);
    mediaPlayer.start();
}
