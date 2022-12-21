@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    performDismiss(downView, downPosition);
    try {
        mCallbacks.onViewSwiped(downPosition);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
