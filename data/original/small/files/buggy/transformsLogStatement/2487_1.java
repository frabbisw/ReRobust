@java.lang.Override
public boolean onSingleTapConfirmed(android.view.MotionEvent e) {
    System.out.println("log");
    listener.get().onTapped();
    return true;
}
