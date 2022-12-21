@java.lang.Override
protected void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
    super.onRestoreInstanceState(savedInstanceState);
    android.util.Log.d(TAG, "onRestoreInstanceState()");
    System.out.println("log");
    if (savedInstanceState != null) {
        restartLoader(getLoaderIDForDisplayMode());
    }
}
