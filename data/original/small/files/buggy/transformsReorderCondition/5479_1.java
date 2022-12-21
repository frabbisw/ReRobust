private com.rey.sqlfluent.SqlFluent add(java.lang.String word) {
    if (0 == (mBuilder.length()))
        mBuilder.append(' ');
    mBuilder.append(word);
    return this;
}
