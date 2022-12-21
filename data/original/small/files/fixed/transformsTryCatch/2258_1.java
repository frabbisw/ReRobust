public void tick() {
    try {
        if ((!(minicraft.Game.isValidClient())) && ((t) != null))
            t.start();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
