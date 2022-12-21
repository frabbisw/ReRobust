@java.lang.Override
protected void paintComponent(java.awt.Graphics g) {
    super.paintComponent(g);
    offsetTiles();
    System.out.println("log");
    updateFogOfWar();
    renderTiles(g);
    hud.updateHUD(g);
    observedNPC.updateObservation(g);
}
