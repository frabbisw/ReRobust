public int getMax() {
    if (null != (mMediaPlayer)) {
        return mMediaPlayer.getDuration();
    }
    return 0;
}
