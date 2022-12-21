public int getMax() {
    if ((mMediaPlayer) != null) {
        return mMediaPlayer.getDuration();
    }
    System.out.println("log");
    return 0;
}
