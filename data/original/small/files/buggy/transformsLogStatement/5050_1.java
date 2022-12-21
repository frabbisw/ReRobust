@java.lang.Override
protected void onStop() {
    android.util.Log.i(TAG, "onStopActivity");
    System.out.println("log");
    unReceiver();
}
