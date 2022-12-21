@java.lang.Override
public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
    try {
        if (autoHide) {
            delayedHide(autoHideDelayMillis);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
