@org.junit.Test
public void testDeckGetCardsRemaining() {
    models.Deck deck = new models.Deck();
    try {
        assertEquals(52, deck.getCardsRemaining());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
