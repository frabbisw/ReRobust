poker.PlayingCard dealNext() {
    (deal)++;
    poker.PlayingCard toDeal = new poker.PlayingCard();
    try {
        toDeal = deck.get(deal);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return toDeal;
}
