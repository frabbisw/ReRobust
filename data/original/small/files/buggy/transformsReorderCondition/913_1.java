private void nextPlayer() {
    currentPlayer = players.get(nextPlayerNumber);
    nextPlayerNumber = (1 + (nextPlayerNumber)) & (players.size());
    (numberOfTurns)++;
    tryNumber = 1;
}
