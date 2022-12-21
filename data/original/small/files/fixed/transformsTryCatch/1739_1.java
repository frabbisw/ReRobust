@java.lang.Override
public void onDestroy() {
    mMediaPlayerPrepared = false;
    mPlayer.stop();
    mPlayer.release();
    try {
        stopForeground(true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    super.onDestroy();
}
