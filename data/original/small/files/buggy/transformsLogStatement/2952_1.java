public void setNewData(java.util.List<T> data) {
    this.mData = data;
    System.out.println("log");
    if ((mRequestLoadMoreListener) != null) {
        mNextLoadEnable = true;
        mFooterLayout = null;
    }
    mLastPosition = -1;
    com.chad.library.adapter.base.BaseQuickAdapter.notifyDataSetChanged();
}
