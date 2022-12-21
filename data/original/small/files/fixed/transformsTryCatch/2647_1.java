@java.lang.Override
public void onScaleEnd(android.view.ScaleGestureDetector detector) {
    super.onScaleEnd(detector);
    try {
        swipeRefreshLayout.setEnabled(true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
