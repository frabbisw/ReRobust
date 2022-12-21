@java.lang.Override
public void show() {
    try {
        if (isReady()) {
            android.app.Activity activity = weakActivity.get();
            if (activity != null) {
                activity.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);
            }
            ad.show();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
