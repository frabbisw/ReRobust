@java.lang.Override
public boolean onUnbind(android.content.Intent intent) {
    try {
        android.util.Log.d(TAG, "onUnbind()");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return super.onUnbind(intent);
}
