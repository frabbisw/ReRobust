@java.lang.Override
public void draw(java.awt.Graphics2D g) {
    try {
        g.drawImage(images[type], getRotation(), x, y);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
