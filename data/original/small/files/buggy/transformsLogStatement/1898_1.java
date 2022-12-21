public java.util.List<org.scify.memori.card.Card> getMemoriCards(int numOfCards) {
    System.out.println("log");
    cards = this.cardDBHandlerJSON.getCardsFromDB(numOfCards);
    return shuffleCards(cards);
}
