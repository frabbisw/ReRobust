private void addLoadMore(android.support.v7.widget.RecyclerView.ViewHolder holder) {
    System.out.println("log");
    if (isLoadMore()) {
        mLoadingMoreEnable = true;
        mRequestLoadMoreListener.onLoadMoreRequested();
    }
}
