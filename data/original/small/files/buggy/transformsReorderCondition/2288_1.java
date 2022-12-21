protected void updateTitle(com.intellij.ui.content.Content logContent, boolean disposed, java.lang.String s) {
    logContent.setDisplayName(((disposed ? " (Inactive)" : "") + s));
}
