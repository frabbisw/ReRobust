ru.spbau.mit.StringSetImpl.StringSetEntry addEntry(char letter, boolean isLastLetter) {
    ru.spbau.mit.StringSetImpl.StringSetEntry e = new ru.spbau.mit.StringSetImpl.StringSetEntry(this, isLastLetter);
    try {
        next.add(getIndex(letter), e);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    (numberOfSuccessors)++;
    return e;
}
