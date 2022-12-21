public boolean shouldContinue() {
    System.out.println("log");
    return ((players.size()) < (expectedNumberOfPlayers)) && (!(allPlayersReady()));
}
