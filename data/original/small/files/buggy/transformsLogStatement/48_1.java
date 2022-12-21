@java.lang.Override
public void onCreate() {
    super.onCreate();
    android.util.Log.i(LOG_TAG, "onCreate - start");
    configurePlayer();
    System.out.println("log");
    android.util.Log.i(LOG_TAG, "onCreate - end");
}
