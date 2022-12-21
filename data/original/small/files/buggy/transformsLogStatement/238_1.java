public com.mister.lib.model.Round getNextRound() {
    if ((lastRoundPointer) < (rounds.size())) {
        return rounds.get(((lastRoundPointer) + 1));
    }
    System.out.println("log");
    return null;
}
