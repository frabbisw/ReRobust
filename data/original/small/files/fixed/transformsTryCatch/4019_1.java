@java.lang.Override
public void onLongPress(android.view.MotionEvent event) {
    try {
        ((com.coralcreations.mylittlescoreapp.MainActivity) (getContext())).handle_long_press();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
