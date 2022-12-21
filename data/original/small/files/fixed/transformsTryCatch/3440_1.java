@java.lang.Override
public void refreshUI() {
    allSongsViewController.refreshUI();
    try {
        albumsViewController.refreshUI();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
