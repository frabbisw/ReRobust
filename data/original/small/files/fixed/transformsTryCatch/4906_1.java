@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    getFloatingToolbar().setVisibility(View.INVISIBLE);
    getFab().setVisibility(View.VISIBLE);
    try {
        getAnimationListener().onAnimationFinished();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
