@java.lang.Override
public void newDownloadIndexes() {
    try {
        if ((banner) != null) {
            banner.updateBannerInProgress(false);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    updateSearchText(searchText);
}
