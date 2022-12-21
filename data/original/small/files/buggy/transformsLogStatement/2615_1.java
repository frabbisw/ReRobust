@java.lang.Override
public void onResume() {
    interceptRootViewTouchEvent(true);
    System.out.println("log");
    super.onResume();
}
