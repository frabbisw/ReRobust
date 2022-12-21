@java.lang.Override
protected void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
    super.onRestoreInstanceState(savedInstanceState);
    android.util.Log.d(TAG, "onRestoreInstanceState()");
    try {
        if (savedInstanceState != null) {
            restartLoader(getLoaderIDForDisplayMode());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
