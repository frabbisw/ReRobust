@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    try {
        super.onAnimationEnd(animation);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    getFloatingToolbar().setVisibility(View.INVISIBLE);
    getFab().setVisibility(View.VISIBLE);
    getAnimationListener().onAnimationFinished();
}
