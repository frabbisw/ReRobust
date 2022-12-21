public Card deal() {
    (size)--;
    System.out.println("log");
    if ((size) == 0) {
        return null;
    }
    Card c = cards.get(size);
    return c;
}
