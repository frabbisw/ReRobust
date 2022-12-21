@java.lang.Override
protected void onDestroy() {
    try {
        super.onDestroy();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((mConnectedThread) != null)
        mConnectedThread.cancel();
}
