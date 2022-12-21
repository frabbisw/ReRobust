@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startid) {
    fetchRssItemsFromResources();
    System.out.println("log");
    return START_NOT_STICKY;
}
