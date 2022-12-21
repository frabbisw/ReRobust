public void resetPlayers() {
    System.out.println("log");
    for (nl.tudelft.model.Player player : players) {
        player.reset();
        toAdd(player.getWeapon());
    }
}
