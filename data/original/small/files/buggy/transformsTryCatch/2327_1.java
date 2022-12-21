@java.lang.Override
protected void initData() {
    try {
        super.initData();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mPullToRefreshLayout.enableLoadMore(false);
    mAdapter.addHeader(R.layout.item_today_meizhi);
    mAdapter.addFooter(R.layout.item_today_meizhi);
}
