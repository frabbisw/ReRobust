@java.lang.Override
public void newDownloadIndexes() {
    try {
        if ((banner) != null) {
            banner.updateBannerInProgress();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    reloadData();
}
