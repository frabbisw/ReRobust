@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    timer.cancel();
    tempTimer.cancel();
    timer = null;
    tempTimer = null;
    try {
        matchRef.removeValue();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
