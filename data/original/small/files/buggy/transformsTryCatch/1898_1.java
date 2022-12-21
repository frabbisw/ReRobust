public java.util.List<org.scify.memori.card.Card> getMemoriCards(int numOfCards) {
    try {
        cards = this.cardDBHandlerJSON.getCardsFromDB(numOfCards);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return shuffleCards(cards);
}
