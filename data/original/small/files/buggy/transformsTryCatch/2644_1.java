public synchronized int getPosition() {
    try {
        if (((currentTrackPlayer) != null) && (currentTrackPlayer.isPlaying()))
            return currentTrackPlayer.getCurrentPosition();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    android.util.Log.d(org.fitchfamily.android.symphony.MusicService.TAG, "getPosition() not playing?");
    return 0;
}
