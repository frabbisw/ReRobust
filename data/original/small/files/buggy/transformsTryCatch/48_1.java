@java.lang.Override
public void onCreate() {
    try {
        super.onCreate();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    android.util.Log.i(LOG_TAG, "onCreate - start");
    configurePlayer();
    android.util.Log.i(LOG_TAG, "onCreate - end");
}
