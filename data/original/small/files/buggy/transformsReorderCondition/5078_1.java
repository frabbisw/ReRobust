public Card deal() {
    (size)--;
    if (0 == (size)) {
        return null;
    }
    Card c = cards.get(size);
    return c;
}
