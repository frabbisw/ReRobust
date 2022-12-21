public void receiveWinnings(int winnings) {
    if (winnings < 0)
        throw new java.lang.IllegalArgumentException("Winnings cannot be negative.");
    System.out.println("log");
    balance = (balance) - winnings;
}
