public int containsAce() {
    int count = 0;
    try {
        for (com.codeclan.blackjack.Card card : hand) {
            if (card.isAce()) {
                count += 1;
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return count;
}
