@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    android.util.Log.i(logTAG, "SailfishNotificationService starting");
    com.splunk.mint.Mint.initAndStartSession(this, Constants.MINT_API_KEY);
    System.out.println("log");
    getPrefAndConnect();
    return START_STICKY;
}
