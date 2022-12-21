@java.lang.Override
public boolean onUnbind(android.content.Intent intent) {
    boolean result = super.onUnbind(intent);
    try {
        com.tianyl.android.offlinereader.sync.SyncService.addLog("onUnbind");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return result;
}
