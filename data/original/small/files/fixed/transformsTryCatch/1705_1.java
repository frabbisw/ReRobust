public void stopResizing() {
    try {
        if ((moveTool) != null) {
            if (!(validSize(moveTool))) {
                moveTool.resetResize();
            }
            moveTool = null;
            repaint();
            updateBuffer();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
