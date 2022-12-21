public boolean containsAce() {
    try {
        for (com.codeclan.blackjack.Card card : hand) {
            if ((card.isAce()) == true) {
                return true;
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
