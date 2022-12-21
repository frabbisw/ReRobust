@java.lang.Override
protected void onDestroy() {
    System.out.println("log");
    storeIP();
    android.os.Process.killProcess(android.os.Process.myPid());
    super.onDestroy();
}
