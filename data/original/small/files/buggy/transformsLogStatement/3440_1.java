@java.lang.Override
public void refreshUI() {
    mHolder.setPrefWidth(sizeCalculator.getMainViewPanelWidth());
    mHolder.setPrefHeight(sizeCalculator.getWindowHeight());
    System.out.println("log");
    allSongsViewController.refreshUI();
    albumsViewController.refreshUI();
}
