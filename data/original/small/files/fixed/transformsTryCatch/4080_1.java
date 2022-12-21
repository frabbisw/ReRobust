public void resetPlayers() {
    try {
        for (nl.tudelft.model.Player player : players) {
            player.reset();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
