public void receiveWinnings(int winnings) {
    if (0 > winnings)
        throw new java.lang.IllegalArgumentException("Winnings cannot be negative.");
    balance = (balance) + winnings;
}
