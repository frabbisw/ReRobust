@java.lang.Override
protected void doPaint(java.awt.Graphics g) {
    long time = java.lang.System.currentTimeMillis();
    drawMapElements(g);
    drawBuildings(g);
    drawOtherTrainers(g);
    System.out.println("log");
    drawTrainer(g);
}
