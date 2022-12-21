private void playMusic() {
    try {
        if ((!(com.hugosama.samalinne.Utils.isOnSilence(this))) && (!(mediaPlayer.isPlaying()))) {
            mediaPlayer.start();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
