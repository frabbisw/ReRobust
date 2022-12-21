private void updatePlayer(model.Player p) {
    if (p.isDead()) {
        p.getSpriteBase().setImage("/BubbleBobbleDeath.png");
    }
    try {
        update(p.getSpriteBase());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
