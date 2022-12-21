@java.lang.Override
public void onAnimationEnd(android.animation.Animator animator) {
    System.out.println("log");
    if (this.isSystemShowing)
        setVisibility(View.GONE);
}
