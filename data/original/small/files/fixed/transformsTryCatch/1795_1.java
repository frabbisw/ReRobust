private void updatePlayer(model.Player p) {
    try {
        update(p.getSpriteBase());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
