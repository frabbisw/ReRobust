private void updateCanvasIF() {
    canvasIf = serialiseCanvas();
    canvasIf.repaint();
    canvasFrame.remove(0);
    try {
        canvasFrame.add(canvasIf);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
