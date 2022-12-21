@java.lang.Override
public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
    try {
        if (window != null) {
            window.setStatusBarColor(((java.lang.Integer) (valueAnimator.getAnimatedValue())));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
