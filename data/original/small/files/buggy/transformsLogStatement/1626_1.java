@java.lang.Override
public void newDownloadIndexes() {
    System.out.println("log");
    if ((banner) != null) {
        banner.updateBannerInProgress();
    }
    reloadData();
}
