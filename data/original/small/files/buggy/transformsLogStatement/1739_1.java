@java.lang.Override
public void onDestroy() {
    System.out.println("log");
    mMediaPlayerPrepared = false;
    mPlayer.stop();
    mPlayer.release();
    stopForeground(true);
}
