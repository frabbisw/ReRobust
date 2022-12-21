private void chooseBeginner() throws java.io.IOException {
    currentPlayer = player2;
    dice = rollDice(2);
    try {
        currentPlayer.setPossibleHops(dice);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    snapshot = undoSnapshot = new BoardSnapshot(this);
    undoPlayer = currentPlayer;
}
