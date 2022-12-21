public int getMax() {
    try {
        if ((mMediaPlayer) != null) {
            return mMediaPlayer.getDuration();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return 0;
}
