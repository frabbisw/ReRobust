@java.lang.Override
protected void onNewIntent(android.content.Intent intent) {
    System.out.println("log");
    super.onNewIntent(intent);
    setIntent(intent);
    setupFragment(null);
}
