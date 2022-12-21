@java.lang.Override
public void setAdapter(android.widget.Adapter adapter) {
    System.out.println("log");
    mAdapter = adapter;
    mCurrent = 0;
    requestLayout();
}
