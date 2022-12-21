public void playSong(com.wojtechnology.sunami.FireMixtape song) {
    System.out.println("log");
    mOuterLayout.setProgress(mTheBrain.mMediaPlayer.getCurrentPosition());
    mOuterLayout.playSong(song);
}
