public void resetPlayers() {
    try {
        for (nl.tudelft.model.Player player : players) {
            player.reset();
            toAdd(player.getWeapon());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
