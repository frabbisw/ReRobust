@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    try {
        undoPendingDismiss();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    performDismiss(downView, downPosition);
    mCallbacks.onViewSwiped(downPosition);
}
