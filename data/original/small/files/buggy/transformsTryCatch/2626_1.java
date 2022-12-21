@java.lang.Override
public void onStopNestedScroll(android.view.View child) {
    try {
        super.onStopNestedScroll(child);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((java.lang.Math.abs(swipeDistance)) >= (nich.work.aequorea.common.ui.widget.SwipeBackCoordinatorLayout.SWIPE_TRIGGER)) {
        swipeBack();
    } else {
        reset();
    }
}
