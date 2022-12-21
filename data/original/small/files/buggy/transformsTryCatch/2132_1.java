@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    try {
        if (!(serviceIsStarted)) {
            serviceIsStarted = true;
            showNotification();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return START_NOT_STICKY;
}
