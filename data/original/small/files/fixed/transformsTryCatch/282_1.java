public void setPlayers() {
    try {
        gameLogic.createPlayers();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    colorForPlayer(gameLogic.getNumberOfPlayer());
}
