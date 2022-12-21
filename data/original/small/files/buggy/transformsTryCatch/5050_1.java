@java.lang.Override
protected void onStop() {
    android.util.Log.i(TAG, "onStopActivity");
    try {
        unReceiver();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
