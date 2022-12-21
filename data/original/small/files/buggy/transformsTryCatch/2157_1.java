public void onNewIntent(android.content.Intent intent) {
    super.onNewIntent(intent);
    try {
        startPushData = getPushFromIntent(intent);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    checkMessage(intent);
}
