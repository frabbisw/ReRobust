@java.lang.Override
protected void onPause() {
    super.onPause();
    mSwipeDetector.stop();
    try {
        mSwipeDetector.unregisterObserver(this);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
