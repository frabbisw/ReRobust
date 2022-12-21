@java.lang.Override
protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    try {
        mChildView = getChildAt(0);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    addHeadView();
    addFooterView();
}
