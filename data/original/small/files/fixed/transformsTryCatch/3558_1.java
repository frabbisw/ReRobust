@java.lang.Override
protected void onResume() {
    super.onResume();
    try {
        android.util.Log.d(TAG, "onResume");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
