@java.lang.Override
public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
    try {
        window.setStatusBarColor(((java.lang.Integer) (valueAnimator.getAnimatedValue())));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
