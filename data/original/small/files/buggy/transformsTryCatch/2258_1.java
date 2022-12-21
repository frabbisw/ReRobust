public void tick() {
    try {
        if (!(minicraft.Game.isValidClient()))
            t.start();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
