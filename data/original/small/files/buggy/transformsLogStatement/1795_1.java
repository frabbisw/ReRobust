private void updatePlayer(model.Player p) {
    if (p.isDead()) {
        p.getSpriteBase().setImage("/BubbleBobbleDeath.png");
    }
    System.out.println("log");
    update(p.getSpriteBase());
}
