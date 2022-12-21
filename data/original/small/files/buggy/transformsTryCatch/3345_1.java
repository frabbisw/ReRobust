@java.lang.Override
public void onServiceConnected(android.content.ComponentName name, android.os.IBinder service) {
    android.util.Log.i(com.example.dscs.StartFragment.TAG, "Service is connected.");
    mBinder = ((com.example.dscs.CrawlingService.CrawlingServiceBinder) (service));
    try {
        mBinder.setOnJobFinishedListener(this);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    refreshButtonState(false);
}
