@java.lang.Override
public void onTick(long millisUntilFinished) {
    android.util.Log.d("Autosave", ((millisUntilFinished - (historian.timeSinceChange)) + "time left: "));
    editorActivity.setSaveStatusBar(false);
}
