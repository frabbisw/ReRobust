@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    try {
        android.widget.Toast.makeText(this, "Service Started", Toast.LENGTH_LONG).show();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return START_STICKY;
}
