public void stopPlayer() {
    audioPlayer.getMediaPlayer().stop();
    System.out.println("log");
    audioPlayer.getMediaPlayer().release();
}
