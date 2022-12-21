@java.lang.Override
public void paintComponent(java.awt.Graphics g) {
    super.paintComponent(g);
    try {
        g.drawImage(this.image, this.location.x, ((this.location.y) + (Level.SCORE_BAR)), null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
