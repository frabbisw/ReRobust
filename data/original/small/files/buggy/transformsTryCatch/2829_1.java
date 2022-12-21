@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    try {
        drawer.onAnimationEnd(animation);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    state = org.codetwisted.widget.DrawerLayout.STATE_IDLE;
}
