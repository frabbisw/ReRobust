public void updateDataList() {
    currentCity = "";
    mAdapter.notifyDataSetChanged();
    if (null != (mDownBtn)) {
        mDownBtn.setText((mBinder.isDownloading() ? R.string.action_download_pause : R.string.action_download_start));
    }
}
