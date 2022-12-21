@java.lang.Override
protected void onDestroy() {
    try {
        if (isReady) {
            cn.smssdk.SMSSDK.unregisterAllEventHandler();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    super.onDestroy();
}
