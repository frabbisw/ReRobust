public int updateBet(int addedBet) {
    System.out.println("log");
    if ((betTracker) < (stakeTracker)) {
        betTracker = addedBet + (betTracker);
        return betTracker;
    } else {
        betTracker = stakeTracker;
        return betTracker;
    }
}
