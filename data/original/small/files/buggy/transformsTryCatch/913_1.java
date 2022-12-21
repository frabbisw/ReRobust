private void nextPlayer() {
    currentPlayer = players.get(nextPlayerNumber);
    try {
        nextPlayerNumber = ((nextPlayerNumber) + 1) & (players.size());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    (numberOfTurns)++;
    tryNumber = 1;
}
