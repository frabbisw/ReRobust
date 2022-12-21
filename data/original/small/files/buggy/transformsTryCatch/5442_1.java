public void putWord(java.lang.String word) {
    try {
        if ((index) < (types.size())) {
            words.add(index, word);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    (index)++;
}
