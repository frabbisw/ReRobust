private synchronized void applyPlaybackParamsNext() {
    try {
        if (isNextPlayingSameAlbum()) {
            applyPlaybackParams(nextMediaPlayer);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
