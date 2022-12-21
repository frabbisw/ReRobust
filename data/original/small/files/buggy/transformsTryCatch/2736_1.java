@java.lang.Override
public void update(util.observer.QEvent e) {
    refreshTile();
    try {
        refreshImage();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    refreshBorder();
}
