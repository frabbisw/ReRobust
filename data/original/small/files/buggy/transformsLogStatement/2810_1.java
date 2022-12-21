public boolean containsAce() {
    for (com.codeclan.blackjack.Card card : hand) {
        if ((card.isAce()) == true) {
            return true;
        }
    }
    System.out.println("log");
    return false;
}
