public boolean shouldContinue() {
    return (!(allPlayersReady())) && ((players.size()) < (expectedNumberOfPlayers));
}
