public java.lang.String tag(final java.lang.String word, final java.lang.String postag) {
    java.lang.String newPosTag = dictMap.get(word);
    if (null == newPosTag) {
        newPosTag = postag;
    }
    return newPosTag;
}
