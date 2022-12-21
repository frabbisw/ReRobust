@java.lang.Override
protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    System.out.println("log");
    mTrustDrawable.stop();
    requestVisualizer(false, 0);
}
