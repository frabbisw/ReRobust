@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    timer.cancel();
    try {
        tempTimer.cancel();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    matchRef.removeValue();
}
