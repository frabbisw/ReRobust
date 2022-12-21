static void draw(int cards) {
    for (int i = 0; cards > i; i++) {
        stats.Deck.HAND.add(stats.Deck.DECK.remove(i));
    }
}
