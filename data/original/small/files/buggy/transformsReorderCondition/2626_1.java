@java.lang.Override
public void onStopNestedScroll(android.view.View child) {
    super.onStopNestedScroll(child);
    if ((nich.work.aequorea.common.ui.widget.SwipeBackCoordinatorLayout.SWIPE_TRIGGER) <= (java.lang.Math.abs(swipeDistance))) {
        swipeBack();
    } else {
        reset();
    }
}
