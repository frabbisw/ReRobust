@java.lang.Override
protected void initData() {
    super.initData();
    System.out.println("log");
    mPullToRefreshLayout.enableLoadMore(false);
    mAdapter.addHeader(R.layout.item_today_meizhi);
    mAdapter.addFooter(R.layout.item_today_meizhi);
}
