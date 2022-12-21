@java.lang.Override
public void onStopNestedScroll(android.view.View child, int type) {
    try {
        super.onStopNestedScroll(child, type);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((java.lang.Math.abs(swipeDistance)) >= (nich.work.aequorea.common.ui.widget.SwipeBackCoordinatorLayout.SWIPE_TRIGGER)) {
        swipeBack();
    } else {
        reset();
    }
}
