@java.lang.Override
public void onDestroy() {
    mMediaPlayerPrepared = false;
    try {
        mPlayer.stop();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mPlayer.release();
    stopForeground(true);
}
