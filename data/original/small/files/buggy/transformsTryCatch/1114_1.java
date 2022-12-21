@java.lang.Override
public void onPause() {
    divyang.musicapp_v6.BackgroundMediaService.mediaPlayer.pause();
    setMediaPlaybackState(PlaybackState.STATE_PAUSED);
    try {
        if (!(MainActivity.activity))
            stopForeground(true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    showPausedNotification();
    super.onPause();
}
