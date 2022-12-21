@org.junit.Test
public void testDeckGetCardsRemaining() {
    models.Deck deck = new models.Deck();
    try {
        org.junit.Assert.assertEquals(52, deck.getCardsRemaining());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
