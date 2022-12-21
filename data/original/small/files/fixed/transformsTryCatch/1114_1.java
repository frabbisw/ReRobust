@java.lang.Override
public void onPause() {
    divyang.musicapp_v6.BackgroundMediaService.mediaPlayer.pause();
    try {
        setMediaPlaybackState(PlaybackState.STATE_PAUSED);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    stopForeground(false);
    showPausedNotification();
    super.onPause();
}
