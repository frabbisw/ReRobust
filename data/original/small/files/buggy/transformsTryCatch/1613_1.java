@java.lang.Override
public void onAnimationUpdate(android.animation.ValueAnimator animation) {
    android.util.Log.d("Animate", ((animation.getAnimatedValue()) + ""));
    try {
        animateAlpha = 255 - ((java.lang.Integer) (animation.getAnimatedValue()));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    invalidate();
}
