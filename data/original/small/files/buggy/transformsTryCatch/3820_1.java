@java.lang.Override
protected void paintComponent(java.awt.Graphics g) {
    super.paintComponent(g);
    offsetTiles();
    updateFogOfWar();
    renderTiles(g);
    try {
        hud.updateHUD(g);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    observedNPC.updateObservation(g);
}
