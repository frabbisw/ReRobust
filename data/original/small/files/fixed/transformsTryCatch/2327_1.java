@java.lang.Override
protected void initData() {
    try {
        super.initData();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mPullToRefreshLayout.enableLoadMore(false);
}
