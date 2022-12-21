@java.lang.Override
protected void onStart() {
    super.onStart();
    try {
        android.util.Log.i(com.example.annemarie.worldofbikesdublin.TAG, "The activity is visible and about to be started.");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
