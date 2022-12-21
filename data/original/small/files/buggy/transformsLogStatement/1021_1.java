private void playMusic() {
    System.out.println("log");
    if (mediaPlayer.isPlaying())
        mediaPlayer.stop();
    if (!(com.hugosama.samalinne.Utils.isOnSilence(this))) {
        mediaPlayer.start();
    }
}
