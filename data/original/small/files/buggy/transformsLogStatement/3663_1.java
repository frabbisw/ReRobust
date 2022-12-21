@java.lang.Override
public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
    System.out.println("log");
    window.setStatusBarColor(((java.lang.Integer) (valueAnimator.getAnimatedValue())));
}
