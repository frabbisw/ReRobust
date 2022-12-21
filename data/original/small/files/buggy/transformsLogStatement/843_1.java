public void addBet(com.kukuruznyak.bettingcompany.entity.bet.Bet bet) {
    System.out.println("log");
    if ((this.bets) == null) {
        this.bets = new java.util.LinkedList<>();
    }
    this.bets.add(bet);
}
