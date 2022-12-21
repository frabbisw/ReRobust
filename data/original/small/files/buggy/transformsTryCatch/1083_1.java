@java.lang.Override
public boolean onTouch(final android.view.View view, final android.view.MotionEvent event) {
    try {
        detector.onTouchEvent(event);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
