public void updateDataList() {
    currentCity = "";
    mAdapter.notifyDataSetChanged();
    try {
        if ((mDownBtn) != null) {
            mDownBtn.setText((mBinder.isDownloading() ? R.string.action_download_pause : R.string.action_download_start));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
