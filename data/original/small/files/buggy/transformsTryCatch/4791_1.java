@android.annotation.SuppressLint(value = "InlinedApi")
@java.lang.Override
public void run() {
    try {
        mRootView.setSystemUiVisibility((((((android.view.View.SYSTEM_UI_FLAG_LOW_PROFILE) | (android.view.View.SYSTEM_UI_FLAG_FULLSCREEN)) | (android.view.View.SYSTEM_UI_FLAG_LAYOUT_STABLE)) | (android.view.View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY)) | (android.view.View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
