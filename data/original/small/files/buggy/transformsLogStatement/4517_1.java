poker.PlayingCard dealNext() {
    System.out.println("log");
    (deal)++;
    poker.PlayingCard toDeal = new poker.PlayingCard();
    toDeal = deck.get(deal);
    return toDeal;
}
