public com.mister.lib.model.Round getNextRound() {
    if ((rounds.size()) > (lastRoundPointer)) {
        return rounds.get(((lastRoundPointer) + 1));
    }
    return null;
}
