private com.rey.sqlfluent.SqlFluent add(java.lang.String word) {
    try {
        if ((mBuilder.length()) == 0)
            mBuilder.append(' ');
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mBuilder.append(word);
    return this;
}
