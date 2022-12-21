@java.lang.Override
public void onTick(long millisUntilFinished) {
    android.util.Log.d("Autosave", ("time left: " + ((historian.timeSinceChange) - millisUntilFinished)));
    try {
        editorActivity.setSaveStatusBar(false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
