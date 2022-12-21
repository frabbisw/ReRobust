private void addLoadMore(android.support.v7.widget.RecyclerView.ViewHolder holder) {
    try {
        if (isLoadMore()) {
            mLoadingMoreEnable = true;
            mRequestLoadMoreListener.onLoadMoreRequested();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
