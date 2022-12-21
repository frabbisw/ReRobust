private void setPlayers() {
    gameLogic.createPlayers();
    try {
        colorForPlayer(gameLogic.getNumberOfPlayer());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
