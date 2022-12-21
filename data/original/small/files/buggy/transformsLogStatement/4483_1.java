private void updateCanvasIF() {
    System.out.println("log");
    canvasIf = serialiseCanvas();
    canvasIf.repaint();
    canvasFrame.remove(0);
    canvasFrame.add(canvasIf);
}
