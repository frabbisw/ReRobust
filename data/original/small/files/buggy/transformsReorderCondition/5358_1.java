public int updateBet(int addedBet) {
    if ((stakeTracker) > (betTracker)) {
        betTracker = addedBet + (betTracker);
        return betTracker;
    } else {
        betTracker = stakeTracker;
        return betTracker;
    }
}
