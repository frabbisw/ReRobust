@java.lang.Override
public void onAnimationEnd(android.animation.Animator animator) {
    try {
        if (this.isSystemShowing)
            setVisibility(View.GONE);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
