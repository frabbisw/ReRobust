private void standardInit(java.lang.Integer size) {
    try {
        for (java.lang.Integer i = 0; i < size; i++) {
            cards.add(new com.nirus.game.basics.Card(i));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
