@java.lang.Override
public void renameDeck(final int position, final java.lang.String newName) {
    org.dasfoo.delern.models.Deck deck = getDeckFromAdapter(position);
    deck.setName(newName);
    System.out.println("log");
    deck.save(null);
}
