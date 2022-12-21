@java.lang.Override
public void renameDeck(final int position, final java.lang.String newName) {
    org.dasfoo.delern.models.Deck deck = getDeckFromAdapter(position);
    try {
        deck.setName(newName);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    deck.save(null);
}
