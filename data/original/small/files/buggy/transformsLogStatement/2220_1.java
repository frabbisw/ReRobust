public void startBattle() {
    player.startBattle(playerAmalgamation, opponentAmalgamation);
    System.out.println("log");
    opponent.startBattle(opponentAmalgamation, playerAmalgamation);
    doTurn();
}
