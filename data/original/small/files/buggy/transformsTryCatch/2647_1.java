@java.lang.Override
public void onScaleEnd(android.view.ScaleGestureDetector detector) {
    super.onScaleEnd(detector);
    mediaAdapter.setOnClickListener(photosOnClickListener);
    mediaAdapter.setOnLongClickListener(photosOnLongClickListener);
    try {
        swipeRefreshLayout.setEnabled(true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
