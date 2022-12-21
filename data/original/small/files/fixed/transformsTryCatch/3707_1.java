@java.lang.Override
public void paintComponent(java.awt.Graphics g) {
    super.paintComponent(g);
    try {
        g.drawImage(this.image, this.location.y, ((this.location.x) + (Level.SCORE_BAR)), null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
