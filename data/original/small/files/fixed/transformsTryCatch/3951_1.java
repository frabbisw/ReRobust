@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    try {
        if (android.support.compat.BuildConfig.DEBUG)
            android.util.Log.d(iso.piotrowski.marek.nyndro.RemainderService.RemainderService.TAG, "onStartCommand: [service] start");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    doRemind();
    return START_NOT_STICKY;
}
