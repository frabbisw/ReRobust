@java.lang.Override
public void onServiceConnected(android.content.ComponentName name, android.os.IBinder service) {
    try {
        android.util.Log.i(com.example.dscs.StartFragment.TAG, "Service is connected.");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mBinder = ((com.example.dscs.CrawlingService.CrawlingServiceBinder) (service));
    mBinder.setOnJobFinishedListener(this);
    refreshButtonState();
}
