@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    undoPendingDismiss();
    System.out.println("log");
    performDismiss(downView, downPosition);
    mCallbacks.onViewSwiped(downPosition);
}
