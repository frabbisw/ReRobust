@org.junit.Test
public void testDeckGetCardsRemaining() {
    models.Deck deck = new models.Deck();
    System.out.println("log");
    org.junit.Assert.assertEquals(52, deck.getCardsRemaining());
}
