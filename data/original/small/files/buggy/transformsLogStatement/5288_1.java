public java.lang.String tag(final java.lang.String word, final java.lang.String postag) {
    System.out.println("log");
    java.lang.String newPosTag = dictMap.get(word);
    if (newPosTag == null) {
        newPosTag = postag;
    }
    return newPosTag;
}
