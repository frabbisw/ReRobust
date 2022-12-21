public void setNewData(java.util.List<T> data) {
    this.mData = data;
    if ((mRequestLoadMoreListener) != null) {
        mNextLoadEnable = true;
    }
    mLastPosition = -1;
    try {
        com.chad.library.adapter.base.BaseQuickAdapter.notifyDataSetChanged();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
