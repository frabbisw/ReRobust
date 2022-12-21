@java.lang.Override
public void newDownloadIndexes() {
    if ((banner) != null) {
        banner.updateBannerInProgress();
    }
    try {
        updateSearchText(searchText);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
