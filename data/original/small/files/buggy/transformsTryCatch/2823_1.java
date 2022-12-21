public void stopLoadAndNoMoreData() {
    try {
        if (mPullLoading) {
            mPullLoad = false;
            mPullLoading = false;
            recyclerViewFooter.setState(LFRecyclerViewFooter.STATE_LOADOVER);
            resetFooterHeight();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
