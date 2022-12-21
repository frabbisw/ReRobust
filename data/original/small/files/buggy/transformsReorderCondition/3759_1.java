@java.lang.Override
public void show() {
    if (isReady()) {
        android.app.Activity activity = weakActivity.get();
        if (null != activity) {
            activity.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);
        }
        ad.show();
    }
}
