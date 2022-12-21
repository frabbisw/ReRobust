public void addEntries(interQA.lexicon.Lexicon lexicon, interQA.lexicon.LexicalEntry.POS pos, java.lang.String frame) {
    try {
        addEntries(lexicon, pos, frame, true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
