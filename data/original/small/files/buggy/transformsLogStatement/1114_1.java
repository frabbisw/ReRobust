@java.lang.Override
public void onPause() {
    divyang.musicapp_v6.BackgroundMediaService.mediaPlayer.pause();
    setMediaPlaybackState(PlaybackState.STATE_PAUSED);
    if (!(MainActivity.activity))
        stopForeground(true);
    showPausedNotification();
    System.out.println("log");
    super.onPause();
}
