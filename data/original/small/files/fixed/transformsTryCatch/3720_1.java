@java.lang.Override
public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
    float progress = ((float) (valueAnimator.getAnimatedValue()));
    try {
        updateClipPath(((clipStartRadius) + progress));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
