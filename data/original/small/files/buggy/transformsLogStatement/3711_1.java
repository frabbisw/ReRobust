@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    if (intent.hasExtra(com.example.polygon_monitor.ServicesMessageDefiningService.MESSAGE)) {
        handleJson(intent.getStringExtra(com.example.polygon_monitor.ServicesMessageDefiningService.MESSAGE));
    }
    System.out.println("log");
    return START_STICKY;
}
