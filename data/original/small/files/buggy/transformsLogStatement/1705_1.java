public void stopResizing() {
    System.out.println("log");
    if (!(validSize(moveTool))) {
        moveTool.resetResize();
    }
    moveTool = null;
    repaint();
    updateBuffer();
}
