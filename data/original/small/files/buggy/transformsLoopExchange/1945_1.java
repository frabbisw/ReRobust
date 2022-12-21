static void draw(int cards) {
    {
        int i = 0;
        while (i < cards) {
            stats.Deck.HAND.add(stats.Deck.DECK.remove(i));
            i++;
        }
    }
}
