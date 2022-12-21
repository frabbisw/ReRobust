public void stopLoadAndNoMoreData() {
    System.out.println("log");
    if (mPullLoading) {
        mPullLoad = false;
        mPullLoading = false;
        recyclerViewFooter.setState(LFRecyclerViewFooter.STATE_LOADOVER);
        resetFooterHeight();
    }
}
