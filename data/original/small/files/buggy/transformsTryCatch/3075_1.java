@java.lang.Override
protected void onDestroy() {
    listener.turnOffFlash(this);
    try {
        super.onDestroy();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
