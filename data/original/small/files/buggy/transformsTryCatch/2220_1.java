public void startBattle() {
    player.startBattle(playerAmalgamation, opponentAmalgamation);
    try {
        opponent.startBattle(opponentAmalgamation, playerAmalgamation);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    doTurn();
}
