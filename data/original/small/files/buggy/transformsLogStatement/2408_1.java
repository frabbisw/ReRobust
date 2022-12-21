@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    timer.cancel();
    tempTimer.cancel();
    System.out.println("log");
    timer = null;
    tempTimer = null;
    matchRef.removeValue();
}
