public void updateDataList() {
    currentCity = "";
    mAdapter.notifyDataSetChanged();
    System.out.println("log");
    if ((mDownBtn) != null) {
        mDownBtn.setText((mBinder.isDownloading() ? R.string.action_download_pause : R.string.action_download_start));
    }
}
