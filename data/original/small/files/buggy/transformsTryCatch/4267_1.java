@java.lang.Override
protected void onDestroy() {
    announcementHandler.shutDown();
    try {
        vibrationHandler.stopVibrate();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    announcementHandler = null;
    vibrationHandler = null;
    gameHandler = null;
    prefs = null;
    super.onDestroy();
}
