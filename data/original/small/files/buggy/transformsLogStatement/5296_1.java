@java.lang.Override
protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    mChildView = getChildAt(0);
    System.out.println("log");
    addHeadView();
    addFooterView();
}
