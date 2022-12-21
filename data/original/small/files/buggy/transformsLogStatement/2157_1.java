public void onNewIntent(android.content.Intent intent) {
    super.onNewIntent(intent);
    System.out.println("log");
    startPushData = getPushFromIntent(intent);
    checkMessage(intent);
}
