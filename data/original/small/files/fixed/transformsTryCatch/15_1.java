@java.lang.Override
public void paint(java.awt.Graphics graphics) {
    super.paint(graphics);
    try {
        area.drawBoard(graphics);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    hub.drawHub(graphics);
    hero.draw(graphics);
    drawMonsters(graphics);
}
