@java.lang.Override
public void onPause() {
    try {
        super.onPause();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    android.util.Log.e(com.example.franz.wordreminder.MainActivity.LOG_TAG, "leaving this activity");
    timeExecutorService.shutdown();
}
