public boolean containsAce() {
    for (com.codeclan.blackjack.Card card : hand) {
        if (true == (card.isAce())) {
            return true;
        }
    }
    return false;
}
