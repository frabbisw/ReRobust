@java.lang.Override
public void onDestroy() {
    try {
        com.kaltura.playkit.plugins.KalturaStatsPlugin.log.d("onDestroy");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    intervalOn = false;
    timer.cancel();
}
