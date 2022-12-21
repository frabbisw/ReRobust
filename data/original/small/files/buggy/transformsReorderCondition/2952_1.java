public void setNewData(java.util.List<T> data) {
    this.mData = data;
    if (null != (mRequestLoadMoreListener)) {
        mNextLoadEnable = true;
        mFooterLayout = null;
    }
    mLastPosition = -1;
    com.chad.library.adapter.base.BaseQuickAdapter.notifyDataSetChanged();
}
