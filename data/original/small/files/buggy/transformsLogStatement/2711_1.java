private synchronized void applyPlaybackParamsNext() {
    System.out.println("log");
    if (isNextPlayingSameAlbum()) {
        applyPlaybackParams(nextMediaPlayer);
    }
}
