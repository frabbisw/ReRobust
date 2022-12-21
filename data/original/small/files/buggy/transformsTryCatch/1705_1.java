public void stopResizing() {
    if (!(validSize(moveTool))) {
        moveTool.resetResize();
    }
    moveTool = null;
    repaint();
    try {
        updateBuffer();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
