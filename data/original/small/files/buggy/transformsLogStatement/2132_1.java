@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    System.out.println("log");
    if (!(serviceIsStarted)) {
        serviceIsStarted = true;
        showNotification();
    }
    return START_NOT_STICKY;
}
