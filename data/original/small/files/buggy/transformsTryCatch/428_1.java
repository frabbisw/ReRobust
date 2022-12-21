@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    android.util.Log.i(logTAG, "SailfishNotificationService starting");
    try {
        com.splunk.mint.Mint.initAndStartSession(this, Constants.MINT_API_KEY);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    getPrefAndConnect();
    return START_STICKY;
}
