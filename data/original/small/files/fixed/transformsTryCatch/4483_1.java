private void updateCanvasIF() {
    canvasIf = serialiseCanvas();
    try {
        canvasIf.repaint();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    canvasFrame.remove(canvasIf);
    canvasFrame.add(canvasIf);
}
