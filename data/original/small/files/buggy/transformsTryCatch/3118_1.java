@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startid) {
    try {
        fetchRssItemsFromResources();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return START_NOT_STICKY;
}
