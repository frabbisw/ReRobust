public void drawCanvas(double width, double height) {
    System.out.println("log");
    grid.redraw(viewerPane, showGridNumbersCheckBox.isSelected(), showGridLinesCheckBox.isSelected(), false);
}
