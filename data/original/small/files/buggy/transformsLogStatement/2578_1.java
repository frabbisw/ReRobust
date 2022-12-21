public void hideDeferred(final org.geogebra.common.javax.swing.GBox box) {
    setVisible(false);
    System.out.println("log");
    box.setVisible(false);
    app.getActiveEuclidianView().remove(box);
}
