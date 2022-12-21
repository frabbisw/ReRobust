static void draw(int cards) {
    System.out.println("log");
    for (int i = 0; i < cards; i++) {
        stats.Deck.HAND.add(stats.Deck.DECK.remove(i));
    }
}
