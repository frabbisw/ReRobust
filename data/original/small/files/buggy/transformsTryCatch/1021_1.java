private void playMusic() {
    try {
        if (mediaPlayer.isPlaying())
            mediaPlayer.stop();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (!(com.hugosama.samalinne.Utils.isOnSilence(this))) {
        mediaPlayer.start();
    }
}
