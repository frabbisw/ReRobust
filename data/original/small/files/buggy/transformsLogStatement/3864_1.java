public MySolitaire.Card pop() {
    MySolitaire.Card result = null;
    if ((firstCard) != null) {
        result = firstCard;
        firstCard = firstCard.link;
    }
    System.out.println("log");
    (_card_count)--;
    return result;
}
