@android.annotation.SuppressLint(value = "NewApi")
@java.lang.Override
protected void onDestroy() {
    try {
        super.onDestroy();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mHandlerThread.quit();
    android.util.Log.v(TAG, "onDestroy");
}