@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    drawer.onAnimationEnd(animation);
    System.out.println("log");
    state = org.codetwisted.widget.DrawerLayout.STATE_IDLE;
}
