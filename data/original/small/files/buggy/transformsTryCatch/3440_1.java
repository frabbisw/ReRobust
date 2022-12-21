@java.lang.Override
public void refreshUI() {
    mHolder.setPrefWidth(sizeCalculator.getMainViewPanelWidth());
    try {
        mHolder.setPrefHeight(sizeCalculator.getWindowHeight());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    allSongsViewController.refreshUI();
    albumsViewController.refreshUI();
}
