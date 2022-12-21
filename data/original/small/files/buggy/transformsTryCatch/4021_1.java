@java.lang.Override
public void select(final int tx, final int ty) {
    if (empty()) {
        Solitaire.discardPile.rebank();
        return;
    }
    try {
        Solitaire.discardPile.addCard(pop());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.lang.System.out.println("deckPile select");
}
