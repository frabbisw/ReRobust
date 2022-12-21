@java.lang.Override
protected void doPaint(java.awt.Graphics g) {
    try {
        drawMapElements(g);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    drawBuildings(g);
    drawOtherTrainers(g);
    drawTrainer(g);
}
