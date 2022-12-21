public void hideDeferred(final org.geogebra.common.javax.swing.GBox box) {
    try {
        setVisible(false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    box.setVisible(false);
}
