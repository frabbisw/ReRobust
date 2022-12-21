@java.lang.Override
protected void onStartLoading() {
    try {
        android.util.Log.i("ON Start", "LOG ");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    forceLoad();
}
