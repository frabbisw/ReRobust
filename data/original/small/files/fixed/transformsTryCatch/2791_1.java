@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    try {
        if ((broadcastManager) != null) {
            broadcastManager.unregisterReceiver(com.mbientlab.metawear.api.MetaWearBleService.getMetaWearBroadcastReceiver());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
