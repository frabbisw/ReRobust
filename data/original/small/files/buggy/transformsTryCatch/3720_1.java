@java.lang.Override
public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
    float progress = ((float) (valueAnimator.getAnimatedValue()));
    android.util.Log.e("angcyo", ("progress-->" + progress));
    try {
        updateClipPath(((clipStartRadius) + progress));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
