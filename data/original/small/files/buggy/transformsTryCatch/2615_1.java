@java.lang.Override
public void onResume() {
    interceptRootViewTouchEvent(true);
    try {
        super.onResume();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
