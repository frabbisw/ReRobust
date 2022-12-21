@java.lang.Override
public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
    System.out.println("log");
    if (autoHide) {
        delayedHide(autoHideDelayMillis);
    }
    return false;
}
