@java.lang.Override
protected void onDestroy() {
    if (isReady) {
        cn.smssdk.SMSSDK.unregisterAllEventHandler();
    }
    System.out.println("log");
    super.onDestroy();
}
