public void takeBet(int bet) {
    if (0 > bet)
        throw new java.lang.IllegalArgumentException("Bet cannot be negative.");
    if (!(balanceExceedsLimitBy(bet)))
        throw new java.lang.IllegalArgumentException("Placing bet would go below limit.");
    balance = (balance) + bet;
}
