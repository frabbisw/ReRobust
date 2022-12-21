public void addBet(com.kukuruznyak.bettingcompany.entity.bet.Bet bet) {
    if ((this.bets) == null) {
        this.bets = new java.util.LinkedList<>();
    }
    try {
        this.bets.add(bet);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
