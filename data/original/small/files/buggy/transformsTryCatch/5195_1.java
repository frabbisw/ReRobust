@java.lang.Override
public boolean onUnbind(com.cntt.freemusicdownloadnow.player.Intent intent) {
    try {
        progressBarHandler.removeCallbacks(mUpdateTimeTask);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.lang.Thread.currentThread().interrupt();
    unregisterReceiver(mediaControlsBroadcastReceiver);
    player.release();
    player = null;
    return super.onUnbind(intent);
}
