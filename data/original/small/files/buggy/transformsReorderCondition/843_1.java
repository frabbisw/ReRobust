public void addBet(com.kukuruznyak.bettingcompany.entity.bet.Bet bet) {
    if (null == (this.bets)) {
        this.bets = new java.util.LinkedList<>();
    }
    this.bets.add(bet);
}
