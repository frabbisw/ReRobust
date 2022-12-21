@java.lang.Override
protected void onPause() {
    super.onPause();
    mSwipeDetector.stop();
    System.out.println("log");
    mSwipeDetector.unregisterObserver(this);
}
