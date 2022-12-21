@java.lang.Override
protected void onDestroy() {
    storeIP();
    android.os.Process.killProcess(android.os.Process.myPid());
    try {
        super.onDestroy();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
