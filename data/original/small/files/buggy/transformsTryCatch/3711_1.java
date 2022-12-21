@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    try {
        if (intent.hasExtra(com.example.polygon_monitor.ServicesMessageDefiningService.MESSAGE)) {
            handleJson(intent.getStringExtra(com.example.polygon_monitor.ServicesMessageDefiningService.MESSAGE));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return START_STICKY;
}
