@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    try {
        drawer.onAnimationEnd(animation);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    setState(org.codetwisted.widget.DrawerLayout.STATE_IDLE, 0);
}
