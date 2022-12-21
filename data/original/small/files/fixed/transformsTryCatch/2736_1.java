@java.lang.Override
public void update(util.observer.QEvent e) {
    try {
        refreshTile();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    refreshBorder();
    refreshImage();
}
