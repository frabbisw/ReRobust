@java.lang.Override
public void onAnimationEnd(android.animation.Animator animator) {
    try {
        setVisibility(View.GONE);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
