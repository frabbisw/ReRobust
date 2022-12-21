@java.lang.Override
public void onPause() {
    super.onPause();
    System.out.println("log");
    android.util.Log.e(com.example.franz.wordreminder.MainActivity.LOG_TAG, "leaving this activity");
    timeExecutorService.shutdown();
}
