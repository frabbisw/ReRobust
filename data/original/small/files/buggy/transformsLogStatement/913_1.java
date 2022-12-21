private void nextPlayer() {
    System.out.println("log");
    currentPlayer = players.get(nextPlayerNumber);
    nextPlayerNumber = ((nextPlayerNumber) + 1) & (players.size());
    (numberOfTurns)++;
    tryNumber = 1;
}
