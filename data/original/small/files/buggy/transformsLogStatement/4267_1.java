@java.lang.Override
protected void onDestroy() {
    System.out.println("log");
    announcementHandler.shutDown();
    vibrationHandler.stopVibrate();
    announcementHandler = null;
    vibrationHandler = null;
    gameHandler = null;
    prefs = null;
    super.onDestroy();
}
