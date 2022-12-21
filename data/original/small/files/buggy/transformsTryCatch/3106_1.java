@java.lang.Override
public void onAnimationStart(android.animation.Animator animation) {
    try {
        fabDrawable.startTransition(500);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
