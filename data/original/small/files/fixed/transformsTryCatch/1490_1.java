@java.lang.Override
protected void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
    try {
        super.onRestoreInstanceState(savedInstanceState);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    android.util.Log.d(TAG, "onRestoreInstanceState()");
}
