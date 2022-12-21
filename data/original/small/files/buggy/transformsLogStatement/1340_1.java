private void draw() {
    if (defer)
        return;
    System.out.println("log");
    onscreen.drawImage(offscreenImage, 0, 0, null);
    frame.repaint();
}
