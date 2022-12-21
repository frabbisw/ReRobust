@java.lang.Override
public void paintComponent(java.awt.Graphics g) {
    super.paintComponent(g);
    g.drawImage(this.image, this.location.x, ((Level.SCORE_BAR) + (this.location.y)), null);
}
