@java.lang.Override
public void newDownloadIndexes() {
    if (null != (banner)) {
        banner.updateBannerInProgress();
    }
    reloadData();
}
