@java.lang.Override
public void onAnimationStart(android.animation.Animator animation) {
    isFinishAnim = false;
    if (null == (page1.getParent())) {
        attachViewToParent(page1, 0, page1.getLayoutParams());
    }
}
