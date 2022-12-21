@java.lang.Override
protected void onStop() {
    super.onStop();
    try {
        if (mConnection.isBound()) {
            unbindService(mConnection);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
