@java.lang.Override
public void onLayoutChange(android.view.View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
    System.out.println("log");
    if (!(this.paused)) {
        this.cacheView();
    }
}
