public void drawCanvas(double width, double height) {
    try {
        grid.redraw(viewerPane, showGridNumbersCheckBox.isSelected(), showGridLinesCheckBox.isSelected(), false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
