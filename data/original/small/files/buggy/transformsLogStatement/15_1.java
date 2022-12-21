@java.lang.Override
public void paint(java.awt.Graphics graphics) {
    System.out.println("log");
    super.paint(graphics);
    area.drawBoard(graphics);
    hub.drawHub(graphics);
    hero.draw(graphics);
    boss.draw(graphics);
    drawMonsters(graphics);
}
