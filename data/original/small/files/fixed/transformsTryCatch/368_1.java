@java.lang.Override
protected void onNewIntent(android.content.Intent intent) {
    try {
        super.onNewIntent(intent);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    setupFragment(intent, null);
}
