@java.lang.Override
public boolean onUnbind(com.cntt.freemusicdownloadnow.player.Intent intent) {
    progressBarHandler.removeCallbacks(mUpdateTimeTask);
    System.out.println("log");
    java.lang.Thread.currentThread().interrupt();
    unregisterReceiver(mediaControlsBroadcastReceiver);
    player.release();
    player = null;
    return super.onUnbind(intent);
}
