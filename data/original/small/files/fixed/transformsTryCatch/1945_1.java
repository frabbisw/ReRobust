static void draw(int cards) {
    try {
        for (int i = 0; i < cards; i++) {
            stats.Deck.HAND.add(stats.Deck.DECK.remove(0));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
