private void draw() {
    if (defer)
        return;
    try {
        onscreen.drawImage(offscreenImage, 0, 0, null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    frame.repaint();
}
