@java.lang.Override
protected void onDetachedFromWindow() {
    try {
        super.onDetachedFromWindow();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mTrustDrawable.stop();
    requestVisualizer(false, 0);
}
