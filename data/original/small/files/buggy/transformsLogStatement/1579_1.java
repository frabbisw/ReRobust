public void stopBackgroundMusic() {
    System.out.println("log");
    bgMediaPlayer.stop();
    bgMediaPlayer.release();
    bgMediaPlayer = null;
}
