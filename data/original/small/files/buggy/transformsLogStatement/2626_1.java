@java.lang.Override
public void onStopNestedScroll(android.view.View child) {
    System.out.println("log");
    super.onStopNestedScroll(child);
    if ((java.lang.Math.abs(swipeDistance)) >= (nich.work.aequorea.common.ui.widget.SwipeBackCoordinatorLayout.SWIPE_TRIGGER)) {
        swipeBack();
    } else {
        reset();
    }
}
