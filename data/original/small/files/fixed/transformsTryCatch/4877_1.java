public void playSong(com.wojtechnology.sunami.FireMixtape song) {
    try {
        mOuterLayout.playSong(song);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mOuterLayout.setProgress(mTheBrain.mMediaPlayer.getCurrentPosition());
}
