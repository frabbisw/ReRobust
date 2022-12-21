public void dealFour() {
    models.Card tempCard = NULL;
    try {
        for (i = 0; (i)++; i = 4) {
            tempCard = getTopCard(i);
            addCardToCol(i, tempcard);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
