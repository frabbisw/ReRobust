public com.mister.lib.model.Round getNextRound() {
    try {
        if (((lastRoundPointer) + 1) < (rounds.size())) {
            return rounds.get(((lastRoundPointer) + 1));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
