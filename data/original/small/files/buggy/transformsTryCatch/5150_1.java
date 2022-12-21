public void draw(java.awt.Graphics g, int x, int y) {
    try {
        g.drawImage(image, x, y, width, height, null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
