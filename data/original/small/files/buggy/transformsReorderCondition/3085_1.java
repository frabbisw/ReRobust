public java.lang.String[] getWordsToSearchForSubSuggestions(javax.swing.text.JTextComponent textComponent) {
    java.lang.String block = com.swingautocompletion.util.TextEditorUtils.getCurrentTextBlock(textComponent);
    if (null == block)
        return new java.lang.String[0];
    return block.split("\\s|\\.");
}
