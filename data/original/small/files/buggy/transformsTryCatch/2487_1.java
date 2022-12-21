@java.lang.Override
public boolean onSingleTapConfirmed(android.view.MotionEvent e) {
    try {
        listener.get().onTapped();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
