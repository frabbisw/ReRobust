@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    if (null != (broadcastManager)) {
        broadcastManager.unregisterReceiver(com.mbientlab.metawear.api.MetaWearBleService.getMetaWearBroadcastReceiver());
    }
    unbindMetaWearService();
}
