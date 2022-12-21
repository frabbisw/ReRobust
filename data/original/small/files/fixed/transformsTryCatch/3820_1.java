@java.lang.Override
protected void paintComponent(java.awt.Graphics g) {
    super.paintComponent(g);
    try {
        offsetTiles();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    updateFogOfWar();
    renderTiles(g);
    hud.updateHUD(g);
}
