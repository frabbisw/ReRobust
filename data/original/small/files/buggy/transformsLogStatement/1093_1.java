@java.lang.Override
public void onAnimationStart(android.animation.Animator animation) {
    System.out.println("log");
    isFinishAnim = false;
    if ((page1.getParent()) == null) {
        attachViewToParent(page1, 0, page1.getLayoutParams());
    }
}
