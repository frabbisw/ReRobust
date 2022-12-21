public void playSong(com.wojtechnology.sunami.FireMixtape song) {
    try {
        mOuterLayout.setProgress(mTheBrain.mMediaPlayer.getCurrentPosition());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mOuterLayout.playSong(song);
}
