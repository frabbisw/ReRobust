@java.lang.Override
public boolean onUnbind(android.content.Intent intent) {
    System.out.println("log");
    boolean result = super.onUnbind(intent);
    com.tianyl.android.offlinereader.sync.SyncService.addLog("onUnbind");
    return result;
}
